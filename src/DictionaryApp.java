
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImagingOpException;
import java.io.*;
import java.util.Map;


public class DictionaryApp extends javax.swing.JFrame {

    private javax.swing.JPanel BackgroudPanel1;
    private javax.swing.JPanel BackgroudPanel2;
    private javax.swing.JMenu Edit;
    private javax.swing.JTextField EnterWords;
    private javax.swing.JMenu File;
    private javax.swing.JLabel IconDefinitions;
    private javax.swing.JLabel IconDic;
    private javax.swing.JButton IconSearch;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JMenuBar MenuEdit;
    private javax.swing.JLabel NameApp;
    private javax.swing.JLabel NameLoud;
    private javax.swing.JTextArea OutPutWords;
    private javax.swing.JLabel TailLabel;
    private javax.swing.JLabel headLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton loudSpeaker;
    private javax.swing.JPanel panel;

    private DefaultListModel mod;
    DictionaryCommandline dC = new DictionaryCommandline();

    public DictionaryApp() {
        dC.insertFromFile();
        initComponents();
        Menu.add(panel);
        mod = new DefaultListModel();
        list.setModel(mod);
    }


    private void initComponents() {

        panel = new javax.swing.JPanel();
        list = new javax.swing.JList<>();
        Menu = new javax.swing.JPopupMenu();
        EnterWords = new javax.swing.JTextField();
        IconSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutPutWords = new javax.swing.JTextArea();
        BackgroudPanel1 = new javax.swing.JPanel();
        BackgroudPanel2 = new javax.swing.JPanel();
        headLabel = new javax.swing.JLabel();
        NameApp = new javax.swing.JLabel();
        IconDic = new javax.swing.JLabel();
        TailLabel = new javax.swing.JLabel();
        IconDefinitions = new javax.swing.JLabel();
        loudSpeaker = new javax.swing.JButton();
        NameLoud = new javax.swing.JLabel();
        MenuEdit = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Edit = new javax.swing.JMenu();

        list.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        Menu.setFocusable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(255, 255, 255));

        EnterWords.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EnterWords.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterWordsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterWordsKeyReleased(evt);
            }
        });

        IconSearch.setBackground(new java.awt.Color(51, 51, 255));
        IconSearch.setIcon(new javax.swing.ImageIcon("IconSearch.png")); // NOI18N
        IconSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconSearchActionPerformed(evt);
            }
        });

        OutPutWords.setColumns(20);
        OutPutWords.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OutPutWords.setRows(5);
        jScrollPane1.setViewportView(OutPutWords);

        BackgroudPanel1.setBackground(new java.awt.Color(0, 51, 204));
        BackgroudPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BackgroudPanel2.setBackground(new java.awt.Color(0, 0, 153));

        headLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        headLabel.setForeground(new java.awt.Color(255, 255, 255));
        headLabel.setText("Search");

        NameApp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameApp.setForeground(new java.awt.Color(255, 255, 255));
        NameApp.setText("English Dictionary");

        IconDic.setIcon(new javax.swing.ImageIcon("Book.png")); // NOI18N

        javax.swing.GroupLayout BackgroudPanel2Layout = new javax.swing.GroupLayout(BackgroudPanel2);
        BackgroudPanel2.setLayout(BackgroudPanel2Layout);
        BackgroudPanel2Layout.setHorizontalGroup(
                BackgroudPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroudPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(BackgroudPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(BackgroudPanel2Layout.createSequentialGroup()
                                                .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(BackgroudPanel2Layout.createSequentialGroup()
                                                .addGap(0, 62, Short.MAX_VALUE)
                                                .addComponent(IconDic)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(NameApp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100))))
        );
        BackgroudPanel2Layout.setVerticalGroup(
                BackgroudPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroudPanel2Layout.createSequentialGroup()
                                .addGroup(BackgroudPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(IconDic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameApp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TailLabel.setForeground(new java.awt.Color(255, 255, 255));
        TailLabel.setText("Definitions");

        IconDefinitions.setIcon(new javax.swing.ImageIcon("list1.png")); // NOI18N

        loudSpeaker.setIcon(new javax.swing.ImageIcon("loud.png")); // NOI18N
        loudSpeaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loudSpeakerActionPerformed(evt);
            }
        });

        NameLoud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameLoud.setForeground(new java.awt.Color(255, 255, 255));
        NameLoud.setText("US");

        javax.swing.GroupLayout BackgroudPanel1Layout = new javax.swing.GroupLayout(BackgroudPanel1);
        BackgroudPanel1.setLayout(BackgroudPanel1Layout);
        BackgroudPanel1Layout.setHorizontalGroup(
                BackgroudPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroudPanel1Layout.createSequentialGroup()
                                .addComponent(BackgroudPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IconDefinitions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameLoud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loudSpeaker, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        BackgroudPanel1Layout.setVerticalGroup(
                BackgroudPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BackgroudPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroudPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(BackgroudPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroudPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(TailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(NameLoud))
                                        .addComponent(IconDefinitions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loudSpeaker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        File.setText("File");
        MenuEdit.add(File);

        Edit.setText("Edit");
        MenuEdit.add(Edit);

        setJMenuBar(MenuEdit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(EnterWords, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BackgroudPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(BackgroudPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(EnterWords, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                                        .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addContainerGap())))
        );

        pack();
    }

    /**
     * ấn nút tìm kiếm.
     */
    private void IconSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        OutPutWords.setText("");
        String ch = "";
        for (Map.Entry<String, String> i: dC.dictionary_Management.dictionary.setHashMap){
            if (i.getKey().equals(EnterWords.getText())){
                ch = i.getValue();
            }
        }
        String str = "";
        int start = 0;
        for (int i = 0; i < ch.length(); i++){
            if(ch.charAt(i) == ';'){
                str = str + ch.substring(start, i) + "\n" + "\n";
                start = i+1;
            }
        }
        OutPutWords.append(str);
    }

    /**
     * xóa EnterWords.
     */
    private void EnterWordsKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        OutPutWords.setText("");
    }

    /**
     * gợi ý tìm từ.
     */
    private void EnterWordsKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        String Search = EnterWords.getText().trim();
        if (!Search.equals("")) {
            mod.removeAllElements();
            int count = 0;
            for (String i: dC.dictionary_Management.dictionary.hashMap.keySet()){
                if(i.charAt(0) == Search.charAt(0)){
                    if(i.contains(Search)){
                        mod.addElement(i);
                        count++;
                        if(count == 18) break;
                    }
                }
            }
            Menu.show(EnterWords, 0, EnterWords.getHeight());
        }
    }

    private void loudSpeakerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryApp().setVisible(true);
            }
        });
    }

}