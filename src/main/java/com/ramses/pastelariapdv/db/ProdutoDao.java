package com.ramses.pastelariapdv.db;

import com.ramses.pastelariapdv.db.ConnectionUtils;
import com.ramses.pastelariapdv.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao
{
     public static void salvar(Produto produto) 
        throws SQLException, Exception {
        
        String sql = "INSERT INTO DBPASTELARIA.TBPRODUTOS(nome, categoria, "
                + "quantidade, custo, valor, ingredientes) "
                + "VALUES(?, ?, ?, ?, ?, ?);";
            
            Connection connection = null;
            PreparedStatement preparedStatement = null;
        
            try {
            
            connection = ConnectionUtils.obterConexao();
           
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getCategoria());
            preparedStatement.setInt(3, produto.getQuantidade());
            preparedStatement.setFloat(4, produto.getCusto());
            preparedStatement.setFloat(5, produto.getValor());
            preparedStatement.setString(6, produto.getIngredientes());
            
            preparedStatement.execute();
        } finally {
            
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static List<Produto> listar()
        throws SQLException, Exception {
        
        String sql = "SELECT id, nome, categoria, quantidade, custo, valor, ingredientes  "
                + "FROM DBPASTELARIA.TBPRODUTOS";
        List<Produto> listaProdutos = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try{
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<Produto>();
                }
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setCategoria(result.getString("categoria"));
                produto.setQuantidade(result.getInt("quantidade"));
                produto.setCusto(result.getFloat("custo"));
                produto.setValor(result.getFloat("valor"));
                produto.setIngredientes(result.getString("ingredientes"));
                listaProdutos.add(produto);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaProdutos;
    }

    public static List<Produto> procurar(String nome)
        throws SQLException, Exception {
        
        String sql = "SELECT id, nome, categoria, quantidade, custo, valor, ingredientes  "
                + "FROM DBPASTELARIA.TBPRODUTOS WHERE nome LIKE (?)";
        List<Produto> listaProdutos = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;        
        
        try{
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, "%" + nome + "%");
            
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<Produto>();
                }
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setCategoria(result.getString("categoria"));
                produto.setQuantidade(result.getInt("quantidade"));
                produto.setCusto(result.getFloat("custo"));
                produto.setValor(result.getFloat("valor"));
                produto.setIngredientes(result.getString("ingredientes"));
                listaProdutos.add(produto);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaProdutos;
    }

    public static Produto obter(Integer id) 
        throws SQLException, Exception {
        
        String sql = "SELECT * FROM DBPASTELARIA.TBPRODUTOS WHERE id =?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();
            
            if(result.next()){
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setCategoria(result.getString("categoria"));
                produto.setQuantidade(result.getInt("quantidade"));
                produto.setCusto(result.getFloat("custo"));
                produto.setValor(result.getFloat("valor"));
                produto.setIngredientes(result.getString("ingredientes"));
                
                return produto;
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return null;
    } 
    
    public static void atualizar(Produto produtoAtualizado) 
        throws SQLException, Exception {
        
        String sql = "UPDATE DBPASTELARIA.TBPRODUTOS SET nome = ?, "
                + "categoria = ?, quantidade = ?, custo = ?, "
                + "valor = ?, ingredientes = ? WHERE id = ?;";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, produtoAtualizado.getNome());
            preparedStatement.setString(2, produtoAtualizado.getCategoria());
            preparedStatement.setInt(3, produtoAtualizado.getQuantidade());
            preparedStatement.setFloat(4, produtoAtualizado.getCusto());
            preparedStatement.setFloat(5, produtoAtualizado.getValor());
            preparedStatement.setString(6, produtoAtualizado.getIngredientes());
            preparedStatement.setInt(7, produtoAtualizado.getId());

            //Executa o comando no banco de dados
            preparedStatement.executeUpdate();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static void excluir(Integer id)
        throws SQLException, Exception {
        String sql = "DELETE FROM DBPASTELARIA.TBPRODUTOS WHERE id = ?";        
             
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            //Executa o comando no banco de dados
            preparedStatement.executeUpdate();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    
}

