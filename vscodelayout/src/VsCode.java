import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.FlavorListener;
import java.io.File;

public class VsCode extends JFrame {
    Container MainContainer;
    JPanel ToolBar;

    JPanel StatusBar;

    JPanel MidBar;

    JPanel WorkSpace;

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

    public VsCode() {
        setSize(1920, 1000);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainContainer = getContentPane();
        ToolBar = new JPanel();
        StatusBar = new JPanel();

        MidBar = new JPanel();
        MidBar.setLayout(new BoxLayout(MidBar, BoxLayout.X_AXIS));

        ExtensionBar = new JPanel();
        ExtensionBar.setLayout(new BoxLayout(ExtensionBar, BoxLayout.Y_AXIS));
            ButtonContainer = new JPanel();
            BoxLayout blt = new BoxLayout(ButtonContainer, BoxLayout.Y_AXIS);
            ButtonContainer.setLayout(blt);
            ButtonContainer.setBackground(DefaultBackgroundColor);
                FileBtt = new JButton( new ImageIcon("../resources/file.png"));
                FileBtt.setBackground(new Color(Color.TRANSLUCENT));
                FileBtt.setOpaque(true);
                FileBtt.setContentAreaFilled(false);
                FileBtt.setBorderPainted(false);

                SearchBtt = new JButton( new ImageIcon("../resources/search.png"));
                SearchBtt.setBackground(new Color(Color.TRANSLUCENT));
                SearchBtt.setOpaque(true);
                SearchBtt.setContentAreaFilled(false);
                SearchBtt.setBorderPainted(false);

                GitBtt = new JButton( new ImageIcon("../resources/gitthree.png"));
                GitBtt.setBackground(new Color(Color.TRANSLUCENT));
                GitBtt.setOpaque(true);
                GitBtt.setContentAreaFilled(false);
                GitBtt.setBorderPainted(false);

                DBBtt = new JButton( new ImageIcon("../resources/debug.png"));
                DBBtt.setBackground(new Color(Color.TRANSLUCENT));
                DBBtt.setOpaque(true);
                DBBtt.setContentAreaFilled(false);
                DBBtt.setBorderPainted(false);

                ExtensionBtt = new JButton( new ImageIcon("../resources/extensions.png"));
                ExtensionBtt.setBackground(new Color(Color.TRANSLUCENT));
                ExtensionBtt.setOpaque(true);
                ExtensionBtt.setContentAreaFilled(false);
                ExtensionBtt.setBorderPainted(false);

                Bttt = new JButton( new ImageIcon("../resources/bttt.png"));
                Bttt.setBackground(new Color(Color.TRANSLUCENT));
                Bttt.setOpaque(true);
                Bttt.setContentAreaFilled(false);
                Bttt.setBorderPainted(false);

            SpaceContainer = new JPanel();
            SpaceContainer.setBackground(DefaultBackgroundColor);
            SpaceContainer.setPreferredSize(new Dimension(48, 200));

            ButtonContainer2 = new JPanel();
            ButtonContainer2.setBackground(DefaultBackgroundColor);
            ButtonContainer2.setLayout(new BoxLayout(ButtonContainer2, BoxLayout.Y_AXIS));
            ButtonContainer2.setPreferredSize(new Dimension(48, 200));
                AcountBtt = new JButton( new ImageIcon("../resources/accounts.png"));
                AcountBtt.setBackground(new Color(Color.TRANSLUCENT));
                AcountBtt.setOpaque(true);
                AcountBtt.setContentAreaFilled(false);
                AcountBtt.setBorderPainted(false);

                SettingsBtt = new JButton( new ImageIcon("../resources/settings.png"));
                SettingsBtt.setBackground(new Color(Color.TRANSLUCENT));
                SettingsBtt.setOpaque(true);
                SettingsBtt.setContentAreaFilled(false);
                SettingsBtt.setBorderPainted(false);

        SideBar = new JPanel();
        WorkSpace = new JPanel();

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

        MidBar.add(ExtensionBar);
            ExtensionBar.add(ButtonContainer);
            ExtensionBar.add(SpaceContainer);
            ExtensionBar.add(ButtonContainer2);
        MidBar.add(SideBar);
        MidBar.add(WorkSpace);


        ToolBar.setBackground(DefaultBackgroundColor);
        StatusBar.setBackground(DefaultBackgroundColor);
        ExtensionBar.setBackground(DefaultBackgroundColor);
        SideBar.setBackground(DefaultBackgroundColor);
        WorkSpace.setBackground(WorkSpaceBackgroundColor);

        ToolBar.setPreferredSize(new Dimension((int)Short.MAX_VALUE, 35));
        StatusBar.setPreferredSize(new Dimension((int)Short.MAX_VALUE, 35));
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
        setResizable(false);
    }

    public static void main(String[] args) {
        VsCode code = new VsCode();
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
    }

    private Color DefaultBackgroundColor = new Color(0x181818);
    private Color WorkSpaceBackgroundColor= new Color(0x1F1F1F);
    private Color BorderLineColor = new Color(0x2B2B2B);
}
