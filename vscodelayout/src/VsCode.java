import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

public class VsCode extends JFrame {
    Container MainContainer;
    JPanel ToolBar;
        JPanel ToolBarBox1;
        JPanel ToolBarBox2;
            RoundedTextField SearchBar;
        JPanel ToolBarBox3;

    JPanel StatusBar;
        JButton RmtWinBtt;
        JButton WarningsBtt;
        JPanel Space;

    JPanel MidBar;
        JPanel ExtensionBar;
            JPanel ButtonContainer;
                JButton FileBtt;
                JButton SearchBtt;
                JButton GitBtt;
                JButton DBBtt;
                JButton ExtensionBtt;
                JButton Bttt;
            JPanel SpaceContainer;
            JPanel ButtonContainer2;
                JButton AcountBtt;
                JButton SettingsBtt;
        JPanel SideBar;
            JPanel HeaderContainer;
                JLabel Header;
            JPanel SideBarContent;
        JPanel WorkSpace;
            JTextArea CodeArea;

    public VsCode() {
        setSize(1920, 1000);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainContainer = getContentPane();

        ToolBar = new JPanel();
        ToolBar.setLayout(new BoxLayout(ToolBar, BoxLayout.X_AXIS));
            ToolBarBox1 = new JPanel();
            ToolBarBox2 = new JPanel();
                SearchBar = new RoundedTextField(50);
                SearchBar.setBackground(SearchBarBckgrnd);
                SearchBar.setForeground(SearchBarForeGround);
            ToolBarBox3 = new JPanel();

        StatusBar = new JPanel();
        StatusBar.setLayout(new BoxLayout(StatusBar, BoxLayout.X_AXIS));
            RmtWinBtt = new JButton(new ImageIcon("./vscodelayout/resources/rmtwin.png"));
            RmtWinBtt.setBackground(new Color(Color.TRANSLUCENT));
            RmtWinBtt.setOpaque(true);
            RmtWinBtt.setContentAreaFilled(false);
            RmtWinBtt.setBorderPainted(false);

            WarningsBtt = new JButton(new ImageIcon("./vscodelayout/resources/warnings.png"));
            WarningsBtt.setBackground(new Color(Color.TRANSLUCENT));
            WarningsBtt.setOpaque(true);
            WarningsBtt.setContentAreaFilled(false);
            WarningsBtt.setBorderPainted(false);

            Space = new JPanel();
            Space.setBackground(DefaultBackgroundColor);

        MidBar = new JPanel();
        MidBar.setLayout(new BoxLayout(MidBar, BoxLayout.X_AXIS));

        ExtensionBar = new JPanel();
        ExtensionBar.setLayout(new BoxLayout(ExtensionBar, BoxLayout.Y_AXIS));
            ButtonContainer = new JPanel();
            final BoxLayout blt = new BoxLayout(ButtonContainer, BoxLayout.Y_AXIS);
            ButtonContainer.setLayout(blt);
            ButtonContainer.setBackground(DefaultBackgroundColor);
                FileBtt = new JButton( new ImageIcon("./vscodelayout/resources/file.png"));
                FileBtt.setBackground(new Color(Color.TRANSLUCENT));
                FileBtt.setOpaque(true);
                FileBtt.setContentAreaFilled(false);
                FileBtt.setBorderPainted(false);

                SearchBtt = new JButton( new ImageIcon("./vscodelayout/resources/search.png"));
                SearchBtt.setBackground(new Color(Color.TRANSLUCENT));
                SearchBtt.setOpaque(true);
                SearchBtt.setContentAreaFilled(false);
                SearchBtt.setBorderPainted(false);

                GitBtt = new JButton( new ImageIcon("./vscodelayout/resources/gitthree.png"));
                GitBtt.setBackground(new Color(Color.TRANSLUCENT));
                GitBtt.setOpaque(true);
                GitBtt.setContentAreaFilled(false);
                GitBtt.setBorderPainted(false);

                DBBtt = new JButton( new ImageIcon("./vscodelayout/resources/debug.png"));
                DBBtt.setBackground(new Color(Color.TRANSLUCENT));
                DBBtt.setOpaque(true);
                DBBtt.setContentAreaFilled(false);
                DBBtt.setBorderPainted(false);

                ExtensionBtt = new JButton( new ImageIcon("./vscodelayout/resources/extensions.png"));
                ExtensionBtt.setBackground(new Color(Color.TRANSLUCENT));
                ExtensionBtt.setOpaque(true);
                ExtensionBtt.setContentAreaFilled(false);
                ExtensionBtt.setBorderPainted(false);

                Bttt = new JButton( new ImageIcon("./vscodelayout/resources/bttt.png"));
                Bttt.setBackground(new Color(Color.TRANSLUCENT));
                Bttt.setOpaque(true);
                Bttt.setContentAreaFilled(false);
                Bttt.setBorderPainted(false);

            SpaceContainer = new JPanel();
            SpaceContainer.setBackground(DefaultBackgroundColor);
            SpaceContainer.setPreferredSize(new Dimension(48, 200));

            ButtonContainer2 = new JPanel();
            ButtonContainer2.setBackground(DefaultBackgroundColor);
            ButtonContainer2.setPreferredSize(new Dimension(48,110));
            ButtonContainer2.setLayout(new BoxLayout(ButtonContainer2, BoxLayout.PAGE_AXIS));
                AcountBtt = new JButton( new ImageIcon("./vscodelayout/resources/accounts.png"));
                AcountBtt.setBackground(new Color(Color.TRANSLUCENT));
                AcountBtt.setOpaque(true);
                AcountBtt.setContentAreaFilled(false);
                AcountBtt.setBorderPainted(false);

                SettingsBtt = new JButton( new ImageIcon("./vscodelayout/resources/settings.png"));
                SettingsBtt.setBackground(new Color(Color.TRANSLUCENT));
                SettingsBtt.setOpaque(true);
                SettingsBtt.setContentAreaFilled(false);
                SettingsBtt.setBorderPainted(false);

        SideBar = new JPanel();
        SideBar.setLayout(new BorderLayout());
            HeaderContainer = new JPanel();
            HeaderContainer.setBackground(DefaultBackgroundColor);
            HeaderContainer.setBorder(BorderFactory.createLineBorder(BorderLineColor));
                Header = new JLabel("Explorer", JLabel.LEFT);
                Header.setForeground(SearchBarForeGround);
            SideBarContent = new JPanel();
            SideBarContent.setBackground(DefaultBackgroundColor);

        WorkSpace = new JPanel();
        WorkSpace.setLayout(new BorderLayout());
            CodeArea = new JTextArea();
            CodeArea.setBackground(new Color(Color.TRANSLUCENT));
            CodeArea.setForeground(SearchBarForeGround);
            CodeArea.setOpaque(false);
            {
                Font f = CodeArea.getFont();
                CodeArea.setFont(new Font(f.getName(), f.getStyle(), 20));
            }

        MainContainer.add(ToolBar, BorderLayout.NORTH);
        MainContainer.add(MidBar, BorderLayout.CENTER);
        MainContainer.add(StatusBar,BorderLayout.SOUTH);

        ButtonContainer.add(FileBtt);
        ButtonContainer.add(SearchBtt);
        ButtonContainer.add(GitBtt);
        ButtonContainer.add(GitBtt);
        ButtonContainer.add(ExtensionBtt);
        ButtonContainer.add(Bttt);

        ButtonContainer2.add(AcountBtt);
        ButtonContainer2.add(SettingsBtt);

        ToolBarBox2.add(SearchBar);

        ToolBar.add(ToolBarBox1);
        ToolBar.add(ToolBarBox2);
        ToolBar.add(ToolBarBox3);

        MidBar.add(ExtensionBar);
            ExtensionBar.add(ButtonContainer);
            ExtensionBar.add(SpaceContainer);
            ExtensionBar.add(ButtonContainer2);
        MidBar.add(SideBar);
            SideBar.add(HeaderContainer, BorderLayout.NORTH);
                HeaderContainer.add(Header);
            SideBar.add(SideBarContent, BorderLayout.CENTER);
        MidBar.add(WorkSpace);
            WorkSpace.add(CodeArea);

        StatusBar.add(RmtWinBtt);
        StatusBar.add(WarningsBtt);
        StatusBar.add(Space);


        ToolBar.setBackground(DefaultBackgroundColor);
            ToolBarBox1.setBackground(DefaultBackgroundColor);
            ToolBarBox2.setBackground(DefaultBackgroundColor);
                SearchBar.setPreferredSize(new Dimension(640, 24));
            ToolBarBox3.setBackground(DefaultBackgroundColor);
        StatusBar.setBackground(DefaultBackgroundColor);
        ExtensionBar.setBackground(DefaultBackgroundColor);
        SideBar.setBackground(DefaultBackgroundColor);
        WorkSpace.setBackground(WorkSpaceBackgroundColor);


        ToolBar.setPreferredSize(new Dimension((int)Short.MAX_VALUE, 35));
            ToolBarBox1.setPreferredSize(new Dimension(660, 35));
            ToolBarBox2.setPreferredSize(new Dimension(660, 35));
            ToolBarBox3.setPreferredSize(new Dimension(660, 35));
        StatusBar.setPreferredSize(new Dimension((int)Short.MAX_VALUE, 22));
        ExtensionBar.setPreferredSize(new Dimension( 48, (int)Short.MAX_VALUE));
        SideBar.setPreferredSize(new Dimension(300, (int)Short.MAX_VALUE));
        WorkSpace.setPreferredSize(new Dimension(this.getWidth(), (int)Short.MAX_VALUE));

        ToolBar.setBorder(BorderFactory.createLineBorder(BorderLineColor));
        StatusBar.setBorder(BorderFactory.createLineBorder(BorderLineColor));
        ExtensionBar.setBorder(BorderFactory.createLineBorder(BorderLineColor));
        ExtensionBar.setBackground(new Color(Color.TRANSLUCENT));
        SideBar.setBorder(BorderFactory.createLineBorder(BorderLineColor));
        WorkSpace.setBorder(BorderFactory.createLineBorder(BorderLineColor));

        setVisible(true);
    }

    public static void main(final String[] args) {
        final VsCode code = new VsCode();
    }

    private final Color DefaultBackgroundColor = new Color(0x181818);
    private final Color WorkSpaceBackgroundColor= new Color(0x1F1F1F);
    private final Color BorderLineColor = new Color(0x2B2B2B);
    private final Color SearchBarBckgrnd = new Color(0x2A2A2A);
    private final Color SearchBarForeGround = new Color(0xAAAAAA);
}
