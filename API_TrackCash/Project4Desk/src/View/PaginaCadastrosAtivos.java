package View;

import Controller.Table;
import Controller.VerificarAcesso;
import connection.PesqCanal;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.bean.Usuario;
import javax.swing.ImageIcon;

public class PaginaCadastrosAtivos extends javax.swing.JFrame {

    private PesqCanal DAO;
    private Table table;
    private static Usuario user;

    public PaginaCadastrosAtivos(Usuario u) {
        this.user = u;
        initComponents();
        try {
            DAO = new PesqCanal(u);
            this.table = new Table();
        } catch (Exception e) {

        }
    }

    public void readJTable() {

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_NomeUser = new javax.swing.JLabel();
        btn_SairLogout = new javax.swing.JButton();
        btn_EditarPerfil = new javax.swing.JButton();
        btn_Ajuda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_configADM = new javax.swing.JButton();
        btn_ConfigCanal = new javax.swing.JButton();
        btn_EditarInfo = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lbl_filtros2 = new javax.swing.JLabel();
        cmb_Campo = new javax.swing.JComboBox<>();
        lbl_filtros3 = new javax.swing.JLabel();
        cmb_Ordem = new javax.swing.JComboBox<>();
        jLabel_filtros = new javax.swing.JLabel();
        lbl_filtros1 = new javax.swing.JLabel();
        txt_Busca = new javax.swing.JFormattedTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_canaisAtivos = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        btn_Atualizar = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        cbx_pag = new javax.swing.JComboBox<>();
        next = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações Ativas");
        setIconImage(new ImageIcon(getClass().getResource("/View/imagens/4Desk_Gigante.png")).getImage());
        setMinimumSize(new java.awt.Dimension(800, 730));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 100, 67));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 100, 67));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NomeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_NomeUser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_NomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 5, 330, 30));

        btn_SairLogout.setBackground(new java.awt.Color(255, 62, 21));
        btn_SairLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_SairLogout.setForeground(new java.awt.Color(255, 255, 255));
        btn_SairLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Sair.png"))); // NOI18N
        btn_SairLogout.setText("Sair");
        btn_SairLogout.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_SairLogout.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_SairLogout.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_SairLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SairLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SairLogoutMouseExited(evt);
            }
        });
        btn_SairLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairLogoutActionPerformed(evt);
            }
        });
        btn_SairLogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_SairLogoutKeyPressed(evt);
            }
        });
        jPanel2.add(btn_SairLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 40, 144, -1));

        btn_EditarPerfil.setBackground(new java.awt.Color(255, 62, 21));
        btn_EditarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_EditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/editar_perfil.png"))); // NOI18N
        btn_EditarPerfil.setText("Editar Perfil");
        btn_EditarPerfil.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_EditarPerfil.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_EditarPerfil.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_EditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditarPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditarPerfilMouseExited(evt);
            }
        });
        btn_EditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarPerfilActionPerformed(evt);
            }
        });
        btn_EditarPerfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_EditarPerfilKeyPressed(evt);
            }
        });
        jPanel2.add(btn_EditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 40, 144, -1));

        btn_Ajuda.setBackground(new java.awt.Color(255, 62, 21));
        btn_Ajuda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_Ajuda.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/ajuda.png"))); // NOI18N
        btn_Ajuda.setText("Ajuda");
        btn_Ajuda.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_Ajuda.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_Ajuda.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AjudaMouseExited(evt);
            }
        });
        btn_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AjudaActionPerformed(evt);
            }
        });
        btn_Ajuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_AjudaKeyPressed(evt);
            }
        });
        jPanel2.add(btn_Ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 40, 144, -1));

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 100, 67));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/4d__4_-removebg-preview peq.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 30, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" 4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 210);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(132, 132, 132));
        jPanel5.setPreferredSize(new java.awt.Dimension(1200, 80));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(132, 132, 132));
        jPanel6.setMinimumSize(new java.awt.Dimension(270, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 270));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 18, 75));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Configuracoes_Ativas_2D124B.png"))); // NOI18N
        jLabel6.setText(" Configurações Ativas");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 9, 10, 59);
        jPanel6.add(jLabel6, gridBagConstraints);

        jPanel5.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(132, 132, 132));
        jPanel7.setMinimumSize(new java.awt.Dimension(700, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(700, 100));
        jPanel7.setLayout(null);

        btn_configADM.setBackground(new java.awt.Color(51, 51, 51));
        btn_configADM.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btn_configADM.setForeground(new java.awt.Color(255, 255, 255));
        btn_configADM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Config_Ativas_ADM_FFFFFF.png"))); // NOI18N
        btn_configADM.setText("Canais Ativos ADM");
        btn_configADM.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_configADM.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_configADM.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_configADM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_configADMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_configADMMouseExited(evt);
            }
        });
        btn_configADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configADMActionPerformed(evt);
            }
        });
        btn_configADM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_configADMKeyPressed(evt);
            }
        });
        jPanel7.add(btn_configADM);
        btn_configADM.setBounds(210, 10, 150, 60);

        btn_ConfigCanal.setBackground(new java.awt.Color(51, 51, 51));
        btn_ConfigCanal.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        btn_ConfigCanal.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConfigCanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Configuracao_de_Canal_FFFFFF.png"))); // NOI18N
        btn_ConfigCanal.setText("Configuração de Canal");
        btn_ConfigCanal.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_ConfigCanal.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_ConfigCanal.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_ConfigCanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ConfigCanalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ConfigCanalMouseExited(evt);
            }
        });
        btn_ConfigCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfigCanalActionPerformed(evt);
            }
        });
        btn_ConfigCanal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_ConfigCanalKeyPressed(evt);
            }
        });
        jPanel7.add(btn_ConfigCanal);
        btn_ConfigCanal.setBounds(530, 10, 150, 60);

        btn_EditarInfo.setBackground(new java.awt.Color(51, 51, 51));
        btn_EditarInfo.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        btn_EditarInfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Edicao_de_Informacoes_FFFFFF.png"))); // NOI18N
        btn_EditarInfo.setText("Edição de Informações");
        btn_EditarInfo.setMaximumSize(new java.awt.Dimension(144, 31));
        btn_EditarInfo.setMinimumSize(new java.awt.Dimension(144, 31));
        btn_EditarInfo.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_EditarInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditarInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditarInfoMouseExited(evt);
            }
        });
        btn_EditarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarInfoActionPerformed(evt);
            }
        });
        btn_EditarInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_EditarInfoKeyPressed(evt);
            }
        });
        jPanel7.add(btn_EditarInfo);
        btn_EditarInfo.setBounds(370, 10, 150, 60);

        jPanel5.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(87, 65, 111));
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 80));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUPORTE, FALE CONOSCO: apifatec2@gmail.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 435, 0, 0);
        jPanel9.add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Copyright 2022 - 4Desk Group Company® - Versão 4.0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 410, 20, 410);
        jPanel9.add(jLabel5, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel10.setPreferredSize(new java.awt.Dimension(960, 105));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setMinimumSize(new java.awt.Dimension(1200, 120));
        jPanel11.setPreferredSize(new java.awt.Dimension(1200, 120));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações Ativas"));
        jPanel12.setMinimumSize(new java.awt.Dimension(1200, 120));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(241, 241, 241));
        jPanel13.setMinimumSize(new java.awt.Dimension(1200, 100));
        jPanel13.setLayout(new java.awt.GridBagLayout());

        lbl_filtros2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros2.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros2.setText("Campo de busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 200, 0, 0);
        jPanel13.add(lbl_filtros2, gridBagConstraints);

        cmb_Campo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_Campo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresa", "ContaID", "Login", "Senha", "Token" }));
        cmb_Campo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_Campo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cmb_CampoComponentHidden(evt);
            }
        });
        cmb_Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CampoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 200, 22, 0);
        jPanel13.add(cmb_Campo, gridBagConstraints);

        lbl_filtros3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_filtros3.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros3.setText("Ordem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 50, 0, 0);
        jPanel13.add(lbl_filtros3, gridBagConstraints);

        cmb_Ordem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_Ordem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Decrescente" }));
        cmb_Ordem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_Ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_OrdemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 50, 22, 0);
        jPanel13.add(cmb_Ordem, gridBagConstraints);

        jLabel_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/lupa (4).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 100, 0, 0);
        jPanel13.add(jLabel_filtros, gridBagConstraints);

        lbl_filtros1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_filtros1.setForeground(new java.awt.Color(45, 18, 75));
        lbl_filtros1.setText("Busca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        jPanel13.add(lbl_filtros1, gridBagConstraints);

        txt_Busca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscaActionPerformed(evt);
            }
        });
        txt_Busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscaKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 286;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 100, 22, 190);
        jPanel13.add(txt_Busca, gridBagConstraints);

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel15.setMinimumSize(new java.awt.Dimension(1200, 310));
        jPanel15.setPreferredSize(new java.awt.Dimension(1200, 310));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Canais"));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setMinimumSize(new java.awt.Dimension(1200, 220));
        jPanel17.setPreferredSize(new java.awt.Dimension(1200, 220));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(241, 241, 241));
        jPanel18.setMinimumSize(new java.awt.Dimension(1200, 223));
        jPanel18.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(400, 400));

        tbl_canaisAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "ContaID", "Login", "Senha", "Token"
            }
        ));
        tbl_canaisAtivos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_canaisAtivosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tbl_canaisAtivos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 984;
        gridBagConstraints.ipady = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 25, 90);
        jPanel18.add(jScrollPane2, gridBagConstraints);

        jPanel17.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel19.setMinimumSize(new java.awt.Dimension(1200, 60));
        jPanel19.setPreferredSize(new java.awt.Dimension(1200, 60));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(241, 241, 241));
        jPanel20.setLayout(new java.awt.GridBagLayout());

        btn_Atualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Atualizar.setText("Atualizar Tabela");
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 320, 25, 0);
        jPanel20.add(btn_Atualizar, gridBagConstraints);

        prev.setText("<");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 30, 25, 0);
        jPanel20.add(prev, gridBagConstraints);

        cbx_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_pagActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 25, 0);
        jPanel20.add(cbx_pag, gridBagConstraints);

        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 25, 0);
        jPanel20.add(next, gridBagConstraints);

        btn_Excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 30, 25, 310);
        jPanel20.add(btn_Excluir, gridBagConstraints);

        jPanel19.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel10.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Mostrar na Tabela
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        boolean vf = new VerificarAcesso().isADM(user);

        btn_configADM.setVisible(vf);
        btn_ConfigCanal.setVisible(!vf);

        this.table.updateCBX(tbl_canaisAtivos, user, cbx_pag);

        lbl_NomeUser.setText("Olá, " + user.getNome());


    }//GEN-LAST:event_formWindowOpened

    private void btn_SairLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SairLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SairLogoutMouseEntered

    private void btn_SairLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SairLogoutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SairLogoutMouseExited

    private void btn_SairLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairLogoutActionPerformed
        // TODO add your handling code here:
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setExtendedState(Frame.MAXIMIZED_BOTH);
            telaPrincipal.setVisible(true);
            this.dispose();
        } else {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btn_SairLogoutActionPerformed

    private void btn_SairLogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_SairLogoutKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SairLogoutKeyPressed

    private void btn_EditarPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarPerfilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarPerfilMouseEntered

    private void btn_EditarPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarPerfilMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarPerfilMouseExited

    private void btn_EditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarPerfilActionPerformed
        // TODO add your handling code here:
        PaginaEditarUserProprio paginaEditarUserProprio = new PaginaEditarUserProprio(user);
        paginaEditarUserProprio.setVisible(true);
    }//GEN-LAST:event_btn_EditarPerfilActionPerformed

    private void btn_EditarPerfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EditarPerfilKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarPerfilKeyPressed

    private void btn_AjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AjudaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AjudaMouseEntered

    private void btn_AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AjudaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AjudaMouseExited

    private void btn_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AjudaActionPerformed
        // TODO add your handling code here:
        PaginaAjuda paginaajuda = new PaginaAjuda();
        paginaajuda.setVisible(true);

    }//GEN-LAST:event_btn_AjudaActionPerformed

    private void btn_AjudaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_AjudaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AjudaKeyPressed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2KeyPressed

    private void btn_configADMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configADMMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_configADMMouseEntered

    private void btn_configADMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configADMMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_configADMMouseExited

    private void btn_configADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configADMActionPerformed
        // TODO add your handling code here:
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaCadastrosAtivosAdm paginaCadastrosAtivosAdm = new PaginaCadastrosAtivosAdm(user);
            paginaCadastrosAtivosAdm.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaCadastrosAtivosAdm.setVisible(true);
            this.dispose();
        } else {
            PaginaCadastrosAtivosAdm paginaCadastrosAtivosAdm = new PaginaCadastrosAtivosAdm(user);
            paginaCadastrosAtivosAdm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_configADMActionPerformed

    private void btn_configADMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_configADMKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_configADMKeyPressed

    private void btn_ConfigCanalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfigCanalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConfigCanalMouseEntered

    private void btn_ConfigCanalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfigCanalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConfigCanalMouseExited

    private void btn_ConfigCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfigCanalActionPerformed
        // TODO add your handling code here:
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaConfiguracaoCanal paginaCadastroInfo = new PaginaConfiguracaoCanal(user);
            paginaCadastroInfo.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaCadastroInfo.setVisible(true);
            this.dispose();
        } else {
            PaginaConfiguracaoCanal paginaCadastroInfo = new PaginaConfiguracaoCanal(user);
            paginaCadastroInfo.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_ConfigCanalActionPerformed

    private void btn_ConfigCanalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ConfigCanalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConfigCanalKeyPressed

    private void btn_EditarInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarInfoMouseEntered

    private void btn_EditarInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarInfoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarInfoMouseExited

    private void btn_EditarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarInfoActionPerformed
        // TODO add your handling code here:
        Dimension telaOriginal = getPreferredSize();
        Dimension telaRecente = getSize();

        int tamanhoTelaOriginal = (int) telaOriginal.getWidth();
        int tamanhoTelaRecente = (int) telaRecente.getWidth();

        if (tamanhoTelaOriginal < tamanhoTelaRecente) {
            PaginaEditarInfo paginaEditarCadastros = new PaginaEditarInfo(user);
            paginaEditarCadastros.setExtendedState(Frame.MAXIMIZED_BOTH);
            paginaEditarCadastros.setVisible(true);
            this.dispose();
        } else {
            PaginaEditarInfo paginaEditarCadastros = new PaginaEditarInfo(user);
            paginaEditarCadastros.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_EditarInfoActionPerformed

    private void btn_EditarInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EditarInfoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarInfoKeyPressed

    private void cmb_CampoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cmb_CampoComponentHidden

        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_CampoComponentHidden

    private void cmb_CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CampoActionPerformed

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        this.table.filtroBuscaCanal(tbl_canaisAtivos, busca, campo, ordem, DAO, user);
    }//GEN-LAST:event_cmb_CampoActionPerformed

    private void cmb_OrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_OrdemActionPerformed

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        this.table.filtroBuscaCanal(tbl_canaisAtivos, busca, campo, ordem, DAO, user);
    }//GEN-LAST:event_cmb_OrdemActionPerformed

    private void txt_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscaActionPerformed

        /* */
    }//GEN-LAST:event_txt_BuscaActionPerformed

    private void txt_BuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscaKeyReleased

        String busca = txt_Busca.getText();
        String campo = cmb_Campo.getSelectedItem().toString();
        String ordem = cmb_Ordem.getSelectedItem().toString();

        this.table.filtroBuscaCanal(tbl_canaisAtivos, busca, campo, ordem, DAO, user);
    }//GEN-LAST:event_txt_BuscaKeyReleased

    private void tbl_canaisAtivosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_canaisAtivosAncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_canaisAtivosAncestorAdded

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed

        this.table.setPag(tbl_canaisAtivos, user);
    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed

        int cbxSelected = Integer.parseInt(cbx_pag.getSelectedItem().toString());
        if (cbxSelected >= 1) {
            this.table.back(tbl_canaisAtivos, user, WIDTH, cbx_pag);
        }
    }//GEN-LAST:event_prevActionPerformed

    private void cbx_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_pagActionPerformed

        int cbxSelected = Integer.parseInt(cbx_pag.getSelectedItem().toString());
        this.table.setCBX(tbl_canaisAtivos, user, cbxSelected, cbx_pag);
    }//GEN-LAST:event_cbx_pagActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        int cbxSelected = Integer.parseInt(cbx_pag.getSelectedItem().toString());
        if (cbxSelected <= this.table.getTotalPag()) {
            this.table.next(tbl_canaisAtivos, user, cbxSelected, cbx_pag);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed

        this.table.excluirCanal(tbl_canaisAtivos, user, cbx_pag);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastrosAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCadastrosAtivos(user).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ajuda;
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JButton btn_ConfigCanal;
    private javax.swing.JButton btn_EditarInfo;
    private javax.swing.JButton btn_EditarPerfil;
    private javax.swing.JToggleButton btn_Excluir;
    private javax.swing.JButton btn_SairLogout;
    private javax.swing.JButton btn_configADM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_pag;
    private javax.swing.JComboBox<String> cmb_Campo;
    private javax.swing.JComboBox<String> cmb_Ordem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_filtros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_filtros1;
    private javax.swing.JLabel lbl_filtros2;
    private javax.swing.JLabel lbl_filtros3;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JTable tbl_canaisAtivos;
    private javax.swing.JFormattedTextField txt_Busca;
    // End of variables declaration//GEN-END:variables

}
