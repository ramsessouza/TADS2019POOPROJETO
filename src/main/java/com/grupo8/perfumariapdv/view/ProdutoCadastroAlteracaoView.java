package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.model.Produto;
import com.grupo8.perfumariapdv.model.Validacao;
import com.grupo8.perfumariapdv.controller.ProdutoController;
import javax.swing.JOptionPane;

public class ProdutoCadastroAlteracaoView extends javax.swing.JInternalFrame {
//==============================================================================       
    //NAO MEXER NO METODO ABAIXO (INICIALIZAÇÃO DOS COMPONENTES)
    public ProdutoCadastroAlteracaoView() {
        initComponents();
    }

    //NAO MEXER NO METODO ABAIXO (CÓDIGO GERADOR)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCabecario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCusto = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setBackground(null);
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        setPreferredSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(17, 128, 216));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(853, 29));
        jPanel1.setMinimumSize(new java.awt.Dimension(853, 29));
        jPanel1.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecario.setFont(new java.awt.Font("Futura PT", 0, 20)); // NOI18N
        lbCabecario.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecario.setText("Cadastro de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCabecario)
                .addContainerGap(692, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecario, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");

        txtNome.setBackground(null);
        txtNome.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(14, 22));

        jLabel3.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Categoria");

        cboCategoria.setBackground(java.awt.Color.white);
        cboCategoria.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        cboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Higiene", "Cosmeticos" }));
        cboCategoria.setPreferredSize(new java.awt.Dimension(95, 22));

        jLabel4.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantidade");

        txtQuantidade.setBackground(null);
        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuantidade.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtQuantidade.setMinimumSize(new java.awt.Dimension(4, 22));
        txtQuantidade.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel5.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Custo");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("R$");

        txtCusto.setBackground(null);
        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCusto.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtCusto.setMinimumSize(new java.awt.Dimension(4, 22));
        txtCusto.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel6.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Valor");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("R$");

        txtValor.setBackground(null);
        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtValor.setMinimumSize(new java.awt.Dimension(4, 22));
        txtValor.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel1.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Descrição");

        txtDescricao.setBackground(java.awt.Color.white);
        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnSair.setBackground(new java.awt.Color(17, 128, 216));
        btnSair.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(17, 128, 216));
        btnSalvar.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("OK");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//==============================================================================
     //INSTANCIA DE PRODUTO PARA CASO DE EDICAO
    private Produto produto = null;
    
    //MODO DA TELA CRIAÇÃO E EDICAO
    private boolean modoEdicao = false;
    
    //ID DE PRODUTO PARA CASO DE EDICAO
    private Integer idProduto;
    
    //TEXTO DO CABECARIO
    private String cabecario;
    
    //GETERS E SETERS DA PÁGINA
     public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public boolean isModoEdicao() {
        return modoEdicao;
    }
    
    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }
    
    
    
    //FUNÇÃO DE LIMPAR FORMULÁRIO CADASTRAR/ALTERAR PRODUTO
    public void limparFormulario(){
        txtNome.setText("");
        cboCategoria.setSelectedIndex(0); 
        txtQuantidade.setText("");
        txtCusto.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
    }
    
    //FUNCAO PARA CARREGAR DADOS DO PRODUTO NA TELA
    public void carregarDadosTela(){
        //verifica se está no modo de edição e há um produto para edição
        if (modoEdicao && produto != null) 
        {
            txtNome.setText(produto.getNome());
            
            //combobox fazer for e achar item 
            for (int i = 0; i < cboCategoria.getItemCount(); i++) 
            {
                if (cboCategoria.getItemAt(i).equals(produto.getCategoria())) 
                {
                    cboCategoria.setSelectedIndex(i);
                    break;
                }
            }
            
            //campos formatados usar "setValue"
            txtQuantidade.setValue(produto.getQuantidade());
            txtCusto.setValue(produto.getCusto());
            txtValor.setValue(produto.getValor());
            
            txtDescricao.setText(produto.getDescricao());
        }
    }
    
    //BOTÃO SALVAR ALTERAÇÃO/CADASTRO DE PRODUTO
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //validacao dos campos
        String produtoOK = Validacao.Produto(txtNome.getText(),
            cboCategoria.getSelectedItem().toString(), txtQuantidade.getText(),
            txtCusto.getText(), txtValor.getText());
        
        //Se os campos obrigatórios estiverem okay
        if (produtoOK.equalsIgnoreCase("") || produtoOK == "")
        {
            String respostaController = null;
            
            //verifica se nao esta em modo de edicao
            if (!modoEdicao){
                //caso nao esteja cria um novo objeto
                produto = new Produto();
            }
            
            //coloca dados nos atributos (instancia ocorre no inicio da classe)
            produto.setNome(txtNome.getText());
            produto.setCategoria(cboCategoria.getSelectedItem().toString());
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            produto.setCusto(Float.parseFloat(txtCusto.getText().replaceAll(",", ".")));
            produto.setValor(Float.parseFloat(txtValor.getText().replaceAll(",", ".")));
            produto.setDescricao(txtDescricao.getText());
                
            if (!modoEdicao)//for modo de cadastro
            {
                //envia produto para salvar para o controller
                respostaController = ProdutoController.salvar(produto);
            }
            else//caso for mode de alteracao
            {
                respostaController = ProdutoController.atualizar(produto);
            }
            
            //verifica resposta do controller
            if (respostaController == null)//se a resposta for positiva
            {
                if (!modoEdicao)//se for modo de cadastro
                {
                    JOptionPane.showMessageDialog(rootPane,
                        "Produto cadastrado com sucesso!",
                        "Confirmação",
                        JOptionPane.INFORMATION_MESSAGE);
                } 
                else//caso for modo de alteracao
                {
                    JOptionPane.showMessageDialog(rootPane,
                        "Produto atualizado com sucesso!",
                        "Confirmação",
                        JOptionPane.INFORMATION_MESSAGE);    
                    this.dispose();
                }
                //Limpa o formulário
                limparFormulario();
            }
            else//se a resposta do controller for negativa
            {
                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane, 
                        respostaController
                            +"\n Procure o administrador do sistema!",
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else//se os campos obrigatorios nao foram preenchidos
        {
            JOptionPane.showMessageDialog(this,"O(s) campo(s) abaixo:\n"+produtoOK+
                "Não foram preenchidos, preencha-os e tente novamente!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    //BOTÃO SAIR DA TELA DE CADASTRO/ALTERACAO DE PRODUTOS
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    
    //QUANDO FORM INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Colocar a variavel cabecario no jlabel
        lbCabecario.setText(cabecario);
    }//GEN-LAST:event_formInternalFrameOpened
    
    //QUANDO FORM É EXIBIDO
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Colocar a variavel cabecario no jlabel
        lbCabecario.setText(cabecario);
    }//GEN-LAST:event_formComponentShown

//==============================================================================
    //NAO MEXER (ELEMENTOS DA TELA)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCabecario;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
//==============================================================================       
}
