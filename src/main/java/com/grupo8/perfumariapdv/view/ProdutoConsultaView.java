package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.controller.ProdutoController;
import com.grupo8.perfumariapdv.model.Produto;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ProdutoConsultaView extends javax.swing.JInternalFrame {
//==============================================================================       
    //NAO MEXER NO METODO ABAIXO (INICIALIZAÇÃO DOS COMPONENTES)
    public ProdutoConsultaView() {
        initComponents();
    }

    //NAO MEXER NO METODO ABAIXO (CÓDIGO GERADOR)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoTabela = new javax.swing.JTable();
        lbCabecario = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(710, 550));
        setMinimumSize(new java.awt.Dimension(710, 550));
        setPreferredSize(new java.awt.Dimension(710, 550));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setText("Nome do produto");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        produtoTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Categoria", "Quantidade", "Custo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(produtoTabela);
        if (produtoTabela.getColumnModel().getColumnCount() > 0) {
            produtoTabela.getColumnModel().getColumn(0).setResizable(false);
            produtoTabela.getColumnModel().getColumn(0).setPreferredWidth(3);
            produtoTabela.getColumnModel().getColumn(2).setResizable(false);
            produtoTabela.getColumnModel().getColumn(2).setPreferredWidth(10);
            produtoTabela.getColumnModel().getColumn(3).setResizable(false);
            produtoTabela.getColumnModel().getColumn(3).setPreferredWidth(5);
            produtoTabela.getColumnModel().getColumn(4).setResizable(false);
            produtoTabela.getColumnModel().getColumn(4).setPreferredWidth(5);
            produtoTabela.getColumnModel().getColumn(5).setResizable(false);
            produtoTabela.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        lbCabecario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbCabecario.setText("Consulta de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtProdutoNome)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCabecario, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCabecario)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 435, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSair)
                        .addComponent(btnAlterar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDeletar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//==============================================================================       
    //DECLARA O MODELO DE TABELA PARA SER USADO NA PESQUISA
    private DefaultTableModel tableModel;
    
    //INSTANCIA DA TELA DE CADASTRO/ALTERACAO DE PRODUTO
    ProdutoCadastroAlteracaoView produtoCadastroAlteracao;
    
    public void tableModelLimpar(){
        //NAO ESTA SENDO USADO
        if(tableModel==null)
        {
            //Obtém a tabela para trabalhar nela
            tableModel = (DefaultTableModel) produtoTabela.getModel();
        }
        //Limpa resultados anteriores
        tableModel.setRowCount(0);
    }
    
    //BOTÃO SAIR DA TELA
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    //BOTÃO DELETAR PRODUTO 
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        //verifica se tem dados na tabela visual
        if (produtoTabela.getSelectedRow() >= 0) 
        {
            //Obtém a linha do item selecionado na tabela visual
            final int row = produtoTabela.getSelectedRow();

            //obtem nome do produto para confirmar exclusao
            String nome = (String) produtoTabela.getValueAt(row, 1);

            //Mostra o diálogo de confirmação de exclusão
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão", 
                    JOptionPane.YES_NO_OPTION);

            //verifica se sim ou nao para exclusao
            if (respostaConfirmacao == JOptionPane.YES_OPTION) 
            {
                //Obtém o ID do produto da tabela visual
                Integer idProduto = (Integer) produtoTabela.getValueAt(row, 0);

                //Solicita ao serviço a exclusão do produto com o ID
                String respostaController = ProdutoController.excluir(idProduto);
                
                //verifica se deu certo a exclusao
                if (respostaController == null) 
                {   
                    //pesquisa novamente para exibir os dados modificados
                    pesquisar();
                } 
                else 
                {
                    //Exibe a mensagem de erro ao usuário
                    JOptionPane.showMessageDialog(
                            rootPane, 
                            respostaController 
                                    +"\n Procure o administrador do sistema!",
                            "Falha na Exclusão", 
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    //BOTÃO PESQUISAR PRODUTO
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    //FUNCAO PESQUISAR PRODUTO
    public void pesquisar(){
        List<Produto> resultado = ProdutoController.procurar(
                txtProdutoNome.getText());
        
        //Obtém a tabela para trabalhar nela
        tableModel = (DefaultTableModel) produtoTabela.getModel();
        
        //Limpa resultados anteriores
        tableModel.setRowCount(0);
        
        if (resultado != null && resultado.size() > 0)
        {
            //Percorre a lista de resultados e os adiciona na tabela
            for (int i = 0; i < resultado.size(); i++) 
            {
                
                //Obtém cada item da lista de resultados
                Produto produto = resultado.get(i);

                if (produto != null) 
                {
                    //Cria arrai com resultados
                    Object[] dadosTabela = new Object[6];
                    //Cada dado na coluna correspondente
                    dadosTabela[0] = produto.getId();
                    dadosTabela[1] = produto.getNome();
                    dadosTabela[2] = produto.getCategoria();
                    dadosTabela[3] = produto.getQuantidade();
                    dadosTabela[4] = produto.getCusto();
                    dadosTabela[5] = produto.getValor();

                    //Adiciona a linha de dados na tabela
                    tableModel.addRow(dadosTabela);
                }
            }
        }else{

            //Caso a pesquisa não tenha retornado resultados
            JOptionPane.showMessageDialog(rootPane,
                    "Não existem resultados para a sua pesquisa!",
                    "Não há dados",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //BOTÃO ALTERAR UM PRODUTO
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        //obtem a linha da tabela
        int row = produtoTabela.getSelectedRow();
        
        //obtem o id dessa linha
        Integer idProduto = (Integer) produtoTabela.getValueAt(row, 0);
        
        //chama o controller para obter o produto do id selecionado (nova instancia de produto)
        Produto produto = ProdutoController.obter(idProduto);
        
        //verifica se produto é válido
        if(produto != null)
        {
            //verifica se a tela ja existe
            if(produtoCadastroAlteracao == null )
            {   
                //se não existir faz uma tela
                produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
            }
            //seta o produto da tela de cadastro alteracao com o cliente obtido
            produtoCadastroAlteracao.setProduto(produto);
            
            //Configura a tela de cadastro/alteracao como uma tela de alteracao
            produtoCadastroAlteracao.setModoEdicao(true);
            
            //coloca a tela com cabecario e titulo de alteracao de produto
            produtoCadastroAlteracao.setCabecario("Alteração do Produto: "
                    +produto.getNome());
            produtoCadastroAlteracao.setTitle("PDV Vendas / Consulta de Produto / Alteração de Produto");
            
            //mostro a tela no painel principal
            this.getParent().add(produtoCadastroAlteracao);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            produtoCadastroAlteracao.setVisible(true);
            
            //coloco ela na frente de todas
            produtoCadastroAlteracao.toFront();
            
            //coloco as informacoes do produto na tela
            produtoCadastroAlteracao.carregarDadosTela();
        
            //redimensiona tela para tamanho do painel
            try 
            {
                produtoCadastroAlteracao.setMaximum(true);
            } 
            catch (PropertyVetoException ex) 
            {
                Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            //retira o painel superior
            ((BasicInternalFrameUI)produtoCadastroAlteracao.getUI()).setNorthPane(null);
        }
        else
        {
            //informa ao usuário que não foi possível abrir o cliente para edição
            JOptionPane.showMessageDialog(rootPane, 
                    "Não foi possível localizar este produto para edição. "
                            + "\n Procure o administrador do sistema!",
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    //AO ABRIR
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //NAO ESTA SENDO USADO
    }//GEN-LAST:event_formInternalFrameOpened
    
    //AO ATIVAR
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //NAO ESTA SENDO USADO
    }//GEN-LAST:event_formInternalFrameActivated

//==============================================================================       
    //NAO MEXER (ELEMENTOS DA TELA)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCabecario;
    private javax.swing.JTable produtoTabela;
    private javax.swing.JTextField txtProdutoNome;
    // End of variables declaration//GEN-END:variables
//==============================================================================       
}
