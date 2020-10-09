
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImagingOpException;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;


public class DictionaryApp extends javax.swing.JFrame {

    private javax.swing.JPanel BackgroudPanel1;
    private javax.swing.JPanel BackgroudPanel2;
    private javax.swing.JTextField EnterWords;
    private javax.swing.JLabel FixWELabel;
    private javax.swing.JLabel FixWTLabel;
    private javax.swing.JLabel IconBook;
    private javax.swing.JLabel IconDefinitions;
    private javax.swing.JLabel IconDic;
    private javax.swing.JButton IconSearch;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JPopupMenu MenuAddWords;
    private javax.swing.JPopupMenu MenuDelWords;
    private javax.swing.JPopupMenu MenuFixWords;
    private javax.swing.JPopupMenu MenuOpt;
    private javax.swing.JButton MoreOptions;
    private javax.swing.JLabel NameApp;
    private javax.swing.JLabel NameLoud;
    private javax.swing.JTextArea OutPutWords;
    private javax.swing.JPanel PanelAddWords;
    private javax.swing.JPanel PanelDelWords;
    private javax.swing.JPanel PanelEditWords;
    private javax.swing.JLabel TailLabel;
    private javax.swing.JTextField WTText;
    private javax.swing.JButton addWords;
    private javax.swing.JLabel delWLabel;
    private javax.swing.JTextField delWText;
    private javax.swing.JButton delWords;
    private javax.swing.JButton editWords;
    private javax.swing.JLabel editWtarget;
    private javax.swing.JTextField fixWordExplain;
    private javax.swing.JTextField fixWordTarget;
    private javax.swing.JLabel headLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelExit;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbEditExit;
    private javax.swing.JButton jbExitAdd;
    private javax.swing.JList<String> list;
    private javax.swing.JButton loudSpeaker;
    private javax.swing.JPanel panelMoreOpt;
    private javax.swing.JPanel panelSuggestions;
    private javax.swing.JTextField textWExplain;
    private javax.swing.JTextField textWTarget;
    private javax.swing.JLabel wExplainLabel;
    private javax.swing.JLabel wTargetLabel;

    private DefaultListModel mod;
    DictionaryCommandline dC = new DictionaryCommandline();
    Speak speak = new Speak();

    public DictionaryApp() {
        dC.insertFromFile();
        initComponents();
        Menu.add(panelSuggestions);
        mod = new DefaultListModel();
        list.setModel(mod);
        MenuOpt.add(panelMoreOpt);
        MenuAddWords.add(PanelAddWords);
        MenuDelWords.add(PanelDelWords);
        MenuFixWords.add(PanelEditWords);
    }


    private void initComponents() {

        panelSuggestions = new javax.swing.JPanel();
        list = new javax.swing.JList<>();
        Menu = new javax.swing.JPopupMenu();
        panelMoreOpt = new javax.swing.JPanel();
        addWords = new javax.swing.JButton();
        delWords = new javax.swing.JButton();
        editWords = new javax.swing.JButton();
        MenuOpt = new javax.swing.JPopupMenu();
        PanelAddWords = new javax.swing.JPanel();
        wTargetLabel = new javax.swing.JLabel();
        wExplainLabel = new javax.swing.JLabel();
        textWTarget = new javax.swing.JTextField();
        textWExplain = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbExitAdd = new javax.swing.JButton();
        MenuAddWords = new javax.swing.JPopupMenu();
        PanelDelWords = new javax.swing.JPanel();
        delWLabel = new javax.swing.JLabel();
        delWText = new javax.swing.JTextField();
        jbDelete = new javax.swing.JButton();
        jbDelExit = new javax.swing.JButton();
        MenuDelWords = new javax.swing.JPopupMenu();
        PanelEditWords = new javax.swing.JPanel();
        editWtarget = new javax.swing.JLabel();
        WTText = new javax.swing.JTextField();
        fixWordTarget = new javax.swing.JTextField();
        fixWordExplain = new javax.swing.JTextField();
        jbEdit = new javax.swing.JButton();
        jbEditExit = new javax.swing.JButton();
        FixWTLabel = new javax.swing.JLabel();
        FixWELabel = new javax.swing.JLabel();
        MenuFixWords = new javax.swing.JPopupMenu();
        EnterWords = new javax.swing.JTextField();
        IconSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutPutWords = new javax.swing.JTextArea();
        BackgroudPanel1 = new javax.swing.JPanel();
        TailLabel = new javax.swing.JLabel();
        IconDefinitions = new javax.swing.JLabel();
        NameLoud = new javax.swing.JLabel();
        loudSpeaker = new javax.swing.JButton();
        MoreOptions = new javax.swing.JButton();
        BackgroudPanel2 = new javax.swing.JPanel();
        headLabel = new javax.swing.JLabel();
        NameApp = new javax.swing.JLabel();
        IconDic = new javax.swing.JLabel();
        IconBook = new javax.swing.JLabel();

        list.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelSuggestionsLayout = new javax.swing.GroupLayout(panelSuggestions);
        panelSuggestions.setLayout(panelSuggestionsLayout);
        panelSuggestionsLayout.setHorizontalGroup(
                panelSuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );
        panelSuggestionsLayout.setVerticalGroup(
                panelSuggestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Menu.setFocusable(false);

        panelMoreOpt.setBackground(new java.awt.Color(255, 255, 255));

        addWords.setText("Add Words");
        addWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordsActionPerformed(evt);
            }
        });

        delWords.setText("Delete Words");
        delWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delWordsActionPerformed(evt);
            }
        });

        editWords.setText("Edit Words");
        editWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editWordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMoreOptLayout = new javax.swing.GroupLayout(panelMoreOpt);
        panelMoreOpt.setLayout(panelMoreOptLayout);
        panelMoreOptLayout.setHorizontalGroup(
                panelMoreOptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delWords, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(editWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMoreOptLayout.setVerticalGroup(
                panelMoreOptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMoreOptLayout.createSequentialGroup()
                                .addComponent(addWords)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delWords)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editWords)
                                .addContainerGap())
        );

        wTargetLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wTargetLabel.setText("Words Target");

        wExplainLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wExplainLabel.setText("Words Explain");

        textWTarget.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textWExplain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbExitAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbExitAdd.setText("Exit");
        jbExitAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAddWordsLayout = new javax.swing.GroupLayout(PanelAddWords);
        PanelAddWords.setLayout(PanelAddWordsLayout);
        PanelAddWordsLayout.setHorizontalGroup(
                PanelAddWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAddWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelAddWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(PanelAddWordsLayout.createSequentialGroup()
                                                .addComponent(wTargetLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(textWTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelAddWordsLayout.createSequentialGroup()
                                                .addComponent(wExplainLabel)
                                                .addGap(18, 18, 18)
                                                .addGroup(PanelAddWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PanelAddWordsLayout.createSequentialGroup()
                                                                .addComponent(jbAdd)
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jbExitAdd))
                                                        .addComponent(textWExplain))))
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        PanelAddWordsLayout.setVerticalGroup(
                PanelAddWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAddWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelAddWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wTargetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textWTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelAddWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wExplainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textWExplain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelAddWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbAdd)
                                        .addComponent(jbExitAdd))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        delWLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delWLabel.setText("Enter words");

        delWText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jbDelExit.setText("Exit");
        jbDelExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDelExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDelWordsLayout = new javax.swing.GroupLayout(PanelDelWords);
        PanelDelWords.setLayout(PanelDelWordsLayout);
        PanelDelWordsLayout.setHorizontalGroup(
                PanelDelWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelDelWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(delWLabel)
                                .addGroup(PanelDelWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelDelWordsLayout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jbDelete)
                                                .addGap(30, 30, 30)
                                                .addComponent(jbDelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelDelWordsLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(delWText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(74, Short.MAX_VALUE))
        );
        PanelDelWordsLayout.setVerticalGroup(
                PanelDelWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelDelWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelDelWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(delWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(delWText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelDelWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbDelete)
                                        .addComponent(jbDelExit))
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        editWtarget.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editWtarget.setText("Word Target");

        WTText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fixWordTarget.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fixWordExplain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEdit.setText("Edit");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jbEditExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEditExit.setText("Exit");
        jbEditExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditExitActionPerformed(evt);
            }
        });

        FixWTLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FixWTLabel.setText("Fix Word Target");

        FixWELabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FixWELabel.setText("Fix Word Explain");

        javax.swing.GroupLayout PanelEditWordsLayout = new javax.swing.GroupLayout(PanelEditWords);
        PanelEditWords.setLayout(PanelEditWordsLayout);
        PanelEditWordsLayout.setHorizontalGroup(
                PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditWordsLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(FixWELabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FixWTLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editWtarget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(WTText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fixWordTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fixWordExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditWordsLayout.createSequentialGroup()
                                                .addComponent(jbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbEditExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(95, 95, 95))
        );
        PanelEditWordsLayout.setVerticalGroup(
                PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelEditWordsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editWtarget, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WTText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FixWTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fixWordTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FixWELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fixWordExplain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelEditWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbEditExit)
                                        .addComponent(jbEdit))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

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
        IconSearch.setIcon(new javax.swing.ImageIcon("Search-icon.png")); // NOI18N
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

        TailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TailLabel.setForeground(new java.awt.Color(255, 255, 255));
        TailLabel.setText("Definitions");

        NameLoud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameLoud.setForeground(new java.awt.Color(255, 255, 255));
        NameLoud.setText("US");

        loudSpeaker.setBackground(new java.awt.Color(255, 255, 255));
        loudSpeaker.setIcon(new javax.swing.ImageIcon("Media-Controls-Medium-Volume-icon.png")); // NOI18N
        loudSpeaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loudSpeakerActionPerformed(evt);
            }
        });

        MoreOptions.setBackground(new java.awt.Color(255, 255, 255));
        MoreOptions.setIcon(new javax.swing.ImageIcon("Data-List-icon.png")); // NOI18N
        MoreOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreOptionsActionPerformed(evt);
            }
        });

        BackgroudPanel2.setBackground(new java.awt.Color(0, 0, 153));

        headLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        headLabel.setForeground(new java.awt.Color(255, 255, 255));
        headLabel.setText("Search");

        NameApp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameApp.setForeground(new java.awt.Color(255, 255, 255));
        NameApp.setText("English Dictionary");

        IconBook.setIcon(new javax.swing.ImageIcon("Dictionary-Book-icon.png")); // NOI18N

        javax.swing.GroupLayout BackgroudPanel2Layout = new javax.swing.GroupLayout(BackgroudPanel2);
        BackgroudPanel2.setLayout(BackgroudPanel2Layout);
        BackgroudPanel2Layout.setHorizontalGroup(
                BackgroudPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroudPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IconBook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NameApp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IconDic)
                                .addGap(138, 138, 138))
        );
        BackgroudPanel2Layout.setVerticalGroup(
                BackgroudPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroudPanel2Layout.createSequentialGroup()
                                .addComponent(IconDic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(headLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroudPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IconBook)
                                .addContainerGap())
                        .addGroup(BackgroudPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(NameApp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroudPanel1Layout = new javax.swing.GroupLayout(BackgroudPanel1);
        BackgroudPanel1.setLayout(BackgroudPanel1Layout);
        BackgroudPanel1Layout.setHorizontalGroup(
                BackgroudPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroudPanel1Layout.createSequentialGroup()
                                .addComponent(BackgroudPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MoreOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TailLabel)
                                .addGap(119, 119, 119)
                                .addComponent(IconDefinitions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameLoud)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loudSpeaker, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        BackgroudPanel1Layout.setVerticalGroup(
                BackgroudPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroudPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(BackgroudPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroudPanel1Layout.createSequentialGroup()
                                                .addComponent(IconDefinitions, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5))
                                        .addComponent(loudSpeaker, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MoreOptions, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameLoud, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BackgroudPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BackgroudPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(EnterWords, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(BackgroudPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(EnterWords, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(IconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        int id = dC.searchApp(EnterWords.getText());
        ch = dC.dictionary_Management.dictionary.listWord.get(id).getWord_explain();

        String str = "";
        int start = 0;
        for (int i = 0; i < ch.length(); i++){
            if(ch.charAt(i) == ';'){
                str = str + ch.substring(start, i) + "\n" + "\n";
                start = i+1;
            }
        }
        if(str.equals("")){
            str = ch;
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
            for (Word i: dC.dictionary_Management.dictionary.listWord){
                if(i.getWord_target().charAt(0) == Search.charAt(0)){
                    if(i.getWord_target().contains(Search)){
                        mod.addElement(i.getWord_target());
                        count++;
                        if(count == 10) break;
                    }
                }
            }
            Menu.show(EnterWords, 0, EnterWords.getHeight());
        }
    }

    /**
     * Xử lý âm thanh.
     */
    private void loudSpeakerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String stringSpeak = EnterWords.getText();
        try {
            speak.Speaker(stringSpeak);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * mở Options.
     */
    private void MoreOptionsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MenuOpt.show(MoreOptions, 0, MoreOptions.getHeight());
    }

    /**
     * mở add words.
     */
    private void addWordsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MenuAddWords.show(MoreOptions, 0, MoreOptions.getHeight());
    }

    /**
     * thực hiện thêm từ.
     */
    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String wordTarget = textWTarget.getText();
        String wordExplain = textWExplain.getText();
        if(wordTarget.equals("") || wordExplain.equals("")){
            ;
        }else {
            dC.dictionary_Management.dictionary.addWord(wordTarget, wordExplain);
        }
        textWTarget.setText("");
        textWExplain.setText("");
    }

    /**
     * thoát add words.
     */
    private void jbExitAddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MenuAddWords.setVisible(false);
        textWTarget.setText("");
        textWExplain.setText("");
    }


    /**
     * mở delete words.
     */
    private void delWordsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MenuDelWords.show(MoreOptions, 0, MoreOptions.getHeight());
    }

    /**
     * thực hiện xóa từ.
     */
    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        if (delWText.getText().equals("")){
            ;
        }else {
            String str = delWText.getText();
            int id = dC.searchApp(str);
            if (id == -1){
                ;
            }else {
                dC.dictionary_Management.dictionary.listWord.remove(id);
            }
        }
        delWText.setText("");
    }

    /**
     * thoát delete words.
     */
    private void jbDelExitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MenuDelWords.setVisible(false);
        delWText.setText("");
    }

    /**
     * mở edit words.
     */
    private void editWordsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MenuFixWords.show(MoreOptions, 0, MoreOptions.getHeight());
    }

    /**
     * thực hiện edit words.
     */
    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (WTText.getText().equals("")){
            ;
        }else {
            String str = WTText.getText();
            String fixTarget = fixWordTarget.getText();
            String fixExplain = fixWordExplain.getText();
            int id = dC.searchApp(str);
            if (id != -1){
                if (fixTarget.equals("") && !fixExplain.equals("")){
                    dC.dictionary_Management.dictionary.listWord.get(id).setWord_explain(fixExplain);
                }
                if (fixExplain.equals("") && !fixTarget.equals("")){
                    dC.dictionary_Management.dictionary.listWord.get(id).setWord_target(fixTarget);
                }
                if (!fixTarget.equals("") && !fixExplain.equals("")){
                    dC.dictionary_Management.dictionary.listWord.get(id).setWord_explain(fixExplain);
                    dC.dictionary_Management.dictionary.listWord.get(id).setWord_target(fixTarget);
                }
                Collections.sort(dC.dictionary_Management.dictionary.listWord, new Comparator<Word>() {
                    @Override
                    public int compare(Word o1, Word o2) {
                        return o1.getWord_target().compareTo(o2.getWord_target());
                    }
                });
            }
        }
        WTText.setText("");
        fixWordTarget.setText("");
        fixWordExplain.setText("");
    }

    /**
     * thoát edit words.
     */
    private void jbEditExitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MenuFixWords.setVisible(false);
        WTText.setText("");
        fixWordTarget.setText("");
        fixWordExplain.setText("");
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