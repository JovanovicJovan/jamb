package jamb;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Prikaz extends JPanel
{
    JTextField t1,t3,t2,t4,t5,t6,t7,t8,t9;
    JTextField t10,t11,t12,t13,t14,t15;
    JTextField t16,t17,t24,t25,t26,t30,t27,t28,t29;
    JTextField t18,t19,t20,t21,t22,t23;
    JTextField t45,t44,t43,t42,t41,t40,t39,t31,t32;
    JTextField t33,t34,t35,t36,t37,t38;
    JTextField t46,t47,t48,t49,t50,t51,t52,t53,t54;
    JTextField t55,t56,t57,t58,t59,t60;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JLabel l10,l11,l12,l13,l14,l15,l16;
    JLabel l17,l18,l19,l20;
    public Prikaz()
    {
        setLayout(new GridLayout(16,5));
        setPreferredSize(new Dimension(400,300));
        l1 = new JLabel("q");l2 = new JLabel("1");
        l3 = new JLabel("2");l4 = new JLabel("3");
        l5 = new JLabel("4");l6 = new JLabel("5");
        l7 = new JLabel("6");l8 = new JLabel("Z");
        l9 = new JLabel("+");l10 = new JLabel("-");
        l11 = new JLabel("Z");l12 = new JLabel("P");
        l13 = new JLabel("K");l14 = new JLabel("F");
        l15 = new JLabel("J");l16 = new JLabel("Z");
        l17 = new JLabel("G");l18 = new JLabel("B");
        l19 = new JLabel("D");l20 = new JLabel("N");
        t1 = new JTextField(3);t2 = new JTextField(3);
        t3 = new JTextField(3);t4 = new JTextField(3);
        t5 = new JTextField(3);t6 = new JTextField(3);
        t7 = new JTextField(3);t8 = new JTextField(3);
        t9 = new JTextField(3);t10 = new JTextField(3);
        t11 = new JTextField(3);t12 = new JTextField(3);
        t13 = new JTextField(3);t14 = new JTextField(3);
        t15 = new JTextField(3);
        t16 = new JTextField(3);t17 = new JTextField(3);
        t23 = new JTextField(3);t24 = new JTextField(3);
        t25 = new JTextField(3);t26 = new JTextField(3);
        t27 = new JTextField(3);t28 = new JTextField(3);
        t29 = new JTextField(3);t18 = new JTextField(3);
        t30 = new JTextField(3);t19 = new JTextField(3);
        t22= new JTextField(3);t20 = new JTextField(3);
        t21 = new JTextField(3);
        t31 = new JTextField(3);t32 = new JTextField(3);
        t33 = new JTextField(3);t34 = new JTextField(3);
        t35 = new JTextField(3);t36 = new JTextField(3);
        t37 = new JTextField(3);t38 = new JTextField(3);
        t39 = new JTextField(3);t40 = new JTextField(3);
        t41 = new JTextField(3);t42 = new JTextField(3);
        t43= new JTextField(3);t44 = new JTextField(3);
        t45 = new JTextField(3);
        t46 = new JTextField(3);t47 = new JTextField(3);
        t48 = new JTextField(3);t49 = new JTextField(3);
        t50 = new JTextField(3);t51 = new JTextField(3);
        t52 = new JTextField(3);t53 = new JTextField(3);
        t54 = new JTextField(3);t55 = new JTextField(3);
        t56 = new JTextField(3);t57 = new JTextField(3);
        t58 = new JTextField(3);t59 = new JTextField(3);
        t60 = new JTextField(3);
        add(l1);add(l17);add(l18);add(l19);add(l20);
        add(l2);add(t1);add(t2);add(t3);add(t4);
        add(l3);add(t5);add(t6);add(t7);add(t8);
        add(l4);add(t9);add(t10);add(t11);add(t12);
        add(l5);add(t13);add(t14);add(t15);add(t16);
        add(l6);add(t17);add(t18);add(t19);add(t20);
        add(l7);add(t21);add(t22);add(t23);add(t24);
        add(l8);add(t25);add(t26);add(t27);add(t28);
        add(l9);add(t29);add(t30);add(t31);add(t32);
        add(l10);add(t33);add(t34);add(t35);add(t36);
        add(l11);add(t57);add(t58);add(t59);add(t60);
        add(l13);add(t37);add(t38);add(t39);add(t40);
        add(l14);;add(t55);add(t41);add(t42);add(t43);
        add(l12);add(t44);add(t45);add(t46);add(t47);
        add(l15);add(t48);add(t49);add(t50);add(t51);
        add(l16);add(t52);add(t53);add(t54);add(t56);
    }
}