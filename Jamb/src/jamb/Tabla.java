package jamb;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import javax.swing.JPanel;
public class Tabla extends JPanel
{
    HashSet h;
    int pom = 0;
    Prikaz p;
    static int[] niz;
    private static boolean najava = false;
    private String najavljenoPolje = "";
    public Tabla()
    {
        h = new HashSet();
        niz = new int[6];
        for(int i=0;i<niz.length-1;i++)
            niz[i]=0;
        p = new Prikaz();
        Osluskivac1 o1 = new Osluskivac1();
        Osluskivac3 o3 = new Osluskivac3();
        
        p.t5.setEditable(false);p.t17.setEditable(false);
        p.t9.setEditable(false);p.t21.setEditable(false);
        p.t13.setEditable(false);
        p.t29.setEditable(false);p.t33.setEditable(false);
        p.t37.setEditable(false);p.t55.setEditable(false);
        p.t44.setEditable(false);p.t48.setEditable(false);
        
        p.t3.setEditable(false);p.t31.setEditable(false);
        p.t7.setEditable(false);p.t35.setEditable(false);
        p.t11.setEditable(false);p.t39.setEditable(false);
        p.t15.setEditable(false);p.t42.setEditable(false);
        p.t19.setEditable(false);p.t46.setEditable(false);
        p.t23.setEditable(false);
        
        p.t1.addMouseListener(new Osluskivac());
        p.t50.addMouseListener(new Osluskivac2());
        
        
        p.t2.addMouseListener(o1);p.t30.addMouseListener(o1);
        p.t6.addMouseListener(o1);p.t34.addMouseListener(o1);
        p.t10.addMouseListener(o1);p.t38.addMouseListener(o1);
        p.t18.addMouseListener(o1);p.t41.addMouseListener(o1);
        p.t22.addMouseListener(o1);p.t45.addMouseListener(o1);
        p.t14.addMouseListener(o1);p.t49.addMouseListener(o1);
        
        p.t4.addMouseListener(o3);p.t32.addMouseListener(o3);
        p.t8.addMouseListener(o3);p.t36.addMouseListener(o3);
        p.t12.addMouseListener(o3);p.t40.addMouseListener(o3);
        p.t16.addMouseListener(o3);p.t43.addMouseListener(o3);
        p.t20.addMouseListener(o3);p.t47.addMouseListener(o3);
        p.t24.addMouseListener(o3);p.t51.addMouseListener(o3);
        
        add(p);
    }
    class Osluskivac implements MouseListener
    {
        @Override
        public void mousePressed(MouseEvent e) {
            Object o = e.getSource();
            if(o == p.t1){
                for(int i:niz)
                    if(i == 1)
                        pom++;
                p.t1.setText(Integer.toString(pom));
                p.t1.removeMouseListener(this);
                p.t5.setEditable(true);
                p.t5.addMouseListener(this);
                pom = 0;
            }
            else if(o == p.t5){
                for(int i:niz)
                    if(i == 2)
                        pom+=2;
                p.t5.setText(Integer.toString(pom));
                p.t5.removeMouseListener(this);
                p.t9.setEditable(true);
                p.t9.addMouseListener(this);
                pom = 0;
            }
            else if(o == p.t9){
                for(int i:niz)
                    if(i == 3)
                        pom+=3;
                p.t9.setText(Integer.toString(pom));
                p.t9.removeMouseListener(this);
                p.t13.setEditable(true);
                p.t13.addMouseListener(this);
                pom = 0;
            }
            else if(o == p.t13){
                for(int i:niz)
                    if(i == 4)
                        pom+=4;
                p.t13.setText(Integer.toString(pom));
                p.t13.removeMouseListener(this);
                p.t17.setEditable(true);
                p.t17.addMouseListener(this);
                pom = 0;
            }
            else if(o == p.t17){
                for(int i:niz)
                    if(i == 5)
                        pom+=5;
                p.t17.setText(Integer.toString(pom));
                p.t17.removeMouseListener(this);
                p.t21.setEditable(true);
                p.t21.addMouseListener(this);
                pom = 0;
            }
            else if(o == p.t21){
                for(int i:niz)
                    if(i == 6)
                        pom+=6;
                p.t21.setText(Integer.toString(pom));
                p.t21.removeMouseListener(this);
                p.t29.setEditable(true);
                p.t29.addMouseListener(this);
                pom = 0;
                int rez = Integer.parseInt(p.t1.getText())+Integer.parseInt(p.t5.getText())+Integer.parseInt(p.t9.getText())
                    +Integer.parseInt(p.t13.getText())+ Integer.parseInt(p.t17.getText())+ Integer.parseInt(p.t21.getText());
                p.t25.setText(String.valueOf(rez));
            }
            else if(o == p.t29 && cekProvera()){
                for(int i:niz)
                         pom+=i;
                p.t29.setText(Integer.toString(pom));
                pom = 0;
                p.t29.removeMouseListener(this);
                p.t33.setEditable(true);
                p.t33.addMouseListener(this);
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
            }
            else if(o == p.t33 && cekProvera()){
                for(int i:niz)
                         pom+=i;
                p.t33.setText(Integer.toString(pom));
                pom = 0;
                p.t33.removeMouseListener(this);
                p.t37.setEditable(true);
                p.t37.addMouseListener(this);
                int rez = Integer.parseInt(p.t29.getText())-Integer.parseInt(p.t33.getText());
                p.t57.setText(String.valueOf(rez));
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
            }
            else if(o == p.t37){
                for(int i:niz){
                    if(h.add(i)==true){
                         pom+=i;
                    } else {
                        pom=0;
                        break;
                    }
                }
                if(h.size()-1==5){
                    if(kockice.getBrojac() == 1)
                        p.t37.setText("60");
                    else if(kockice.getBrojac() == 2)
                        p.t37.setText("54");
                    else if(kockice.getBrojac() == 3)
                        p.t37.setText("48");
                } else 
                    p.t37.setText("0");
                p.t37.removeMouseListener(this);
                p.t55.setEditable(true);
                p.t55.addMouseListener(this);
                pom = 0;
                h.removeAll(h);
            }
            else if(o == p.t55){
                int niz[] = new int[6];
                int niz1[] = new int[6];
                int full=0;
                niz[0] = Integer.parseInt(kockice.getL1().getText());
                niz[1] = Integer.parseInt(kockice.getL2().getText());
                niz[2] = Integer.parseInt(kockice.getL3().getText());
                niz[3] = Integer.parseInt(kockice.getL4().getText());
                niz[4] = Integer.parseInt(kockice.getL5().getText());
                niz[5] = Integer.parseInt(kockice.getL6().getText());
                for(int i:niz){
                    if(i == 1) niz1[0]++;if(i == 2) niz1[1]+=1;
                    if(i == 3) niz1[2]+=1;if(i == 4) niz1[3]+=1;
                    if(i == 5) niz1[4]+=1;if(i == 6) niz1[5]+=1;
                }
                for(int i:niz1){
                    if(i==3) full+=3;
                    if(i==2) full+=2;
                }
                if(full==5){
                    if(kockice.getBrojac() == 1)
                        p.t55.setText("60");
                    else if(kockice.getBrojac() == 2)
                        p.t55.setText("54");
                    else if(kockice.getBrojac() == 1)
                        p.t55.setText("48");
                } else 
                    p.t55.setText("0");
                p.t55.removeMouseListener(this);
                p.t44.setEditable(true);
                p.t44.addMouseListener(this);
            }
            else if(o == p.t44){
                int broj=0;
                int p1=0;
                for(int i=0;i<niz.length-1;i++){
                    if(niz[i]!=0){
                        p1=niz[i];
                        break;
                    }
                }
                for(int i=0;i<niz.length-1;i++){
                    if(niz[i]==p1){
                        broj++;
                        pom+=niz[i];
                    }
                }
                if(broj==3)
                    p.t44.setText(String.valueOf(pom));
                else
                    p.t44.setText("0");
                pom = 0;
                p.t44.removeMouseListener(this);
                p.t48.setEditable(true);
                p.t48.addMouseListener(this);
            }
            else if(o == p.t48){
                int k=0;
                if(niz[0] == 0){
                    pom = niz[1];
                } else {
                    pom = niz[0];
                }
                
                for(int i=0;i<niz.length-1;i++){
                    if(pom == niz[i]){
                        k++;
                    }
                }
                if(k>=4){
                    pom = 5*pom;
                    p.t48.setText(Integer.toString(pom));
                } else
                    p.t48.setText("0");
                pom = 0;
                int rez = (Integer.parseInt(p.t48.getText())+Integer.parseInt(p.t44.getText())
                        +Integer.parseInt(p.t55.getText())+Integer.parseInt(p.t37.getText()));
                p.t52.setText(String.valueOf(rez));
            }
            if(!o.equals(p.t29) && !o.equals(p.t33)){
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
            }
            rezultat();
        }
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
        @Override
        public void mouseClicked(MouseEvent e) {}
    }
    class Osluskivac1 implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent e) {
            Object o = e.getSource();
            if(o == p.t2){
                for(int i:niz)
                    if(i == 1)
                        pom++;
                p.t2.setText(Integer.toString(pom));
                pom = 0;
                p.t2.removeMouseListener(this);
            }
            else if(o == p.t6){
                for(int i:niz)
                    if(i == 2)
                        pom+=2;
                p.t6.setText(Integer.toString(pom));
                pom = 0;
                p.t6.removeMouseListener(this);
            }
            else if(o == p.t10){
                for(int i:niz)
                    if(i == 3)
                        pom+=3;
                p.t10.setText(Integer.toString(pom));
                pom = 0;
                p.t10.removeMouseListener(this);
            }
            else if(o == p.t14){
                for(int i:niz)
                    if(i == 4)
                        pom+=4;
                p.t14.setText(Integer.toString(pom));
                pom = 0;
                p.t14.removeMouseListener(this);
            }
            else if(o == p.t18){
                for(int i:niz)
                    if(i == 5)
                        pom+=5;
                p.t18.setText(Integer.toString(pom));
                pom = 0;
                p.t18.removeMouseListener(this);
            }
            else if(o == p.t22){
                for(int i:niz)
                    if(i == 6)
                        pom+=6;
                p.t22.setText(Integer.toString(pom));
                pom = 0;
                p.t22.removeMouseListener(this);
            }
            else if(o == p.t30 && cekProvera()){
                
                for(int i:niz)
                     pom+=i;
                p.t30.setText(Integer.toString(pom));
                pom = 0;
                p.t30.removeMouseListener(this);
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                proveriPrviDeo();
                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
                for(int i=0;i<getNiz().length-1;i++)
                    getNiz()[i]=0;
            }
            else if(o == p.t34 && cekProvera()){
                for(int i:niz)
                         pom+=i;
                p.t34.setText(Integer.toString(pom));
                pom = 0;
                p.t34.removeMouseListener(this);
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                proveriPrviDeo();

                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
                for(int i=0;i<getNiz().length-1;i++)
                    getNiz()[i]=0;
            }
            else if(o == p.t38){
                for(int i:niz){
                    if(h.add(i)==true){
                         pom+=i;
                    } else {
                        pom=0;
                        break;
                    }
                }
                if(h.size()-1==5){
                    if(kockice.getBrojac() == 1)
                        p.t38.setText("60");
                    else if(kockice.getBrojac() == 2)
                        p.t38.setText("54");
                    else if(kockice.getBrojac() == 3)
                        p.t38.setText("48");
                }
                else 
                    p.t38.setText("0");
                pom = 0;
                h.removeAll(h);
                p.t38.removeMouseListener(this);
            }
            else if(o == p.t41){
                int niz[] = new int[6];
                int niz1[] = new int[6];
                int full=0;
                niz[0] = Integer.parseInt(kockice.getL1().getText());
                niz[1] = Integer.parseInt(kockice.getL2().getText());
                niz[2] = Integer.parseInt(kockice.getL3().getText());
                niz[3] = Integer.parseInt(kockice.getL4().getText());
                niz[4] = Integer.parseInt(kockice.getL5().getText());
                niz[5] = Integer.parseInt(kockice.getL6().getText());
                for(int i:niz){
                    if(i == 1) niz1[0]++;if(i == 2) niz1[1]+=1;
                    if(i == 3) niz1[2]+=1;if(i == 4) niz1[3]+=1;
                    if(i == 5) niz1[4]+=1;if(i == 6) niz1[5]+=1;
                }
                for(int i:niz1){
                    if(i==3) full+=3;
                    if(i==2) full+=2;
                }
                if(full==5){
                    if(kockice.getBrojac() == 1)
                        p.t41.setText("60");
                    else if(kockice.getBrojac() == 2)
                        p.t41.setText("54");
                    else if(kockice.getBrojac() == 1)
                        p.t41.setText("48");
                }
                else 
                     p.t41.setText("0");
                p.t41.removeMouseListener(this);
            }
            else if(o == p.t45){
                int broj=0;
                int p1=0;
                for(int i=0;i<niz.length-1;i++){
                    if(niz[i]!=0){
                        p1=niz[i];
                        break;
                    }
                }
                for(int i=0;i<niz.length-1;i++){
                    if(niz[i]==p1){
                        broj++;
                        pom+=niz[i];
                    }
                }
                if(broj==4)
                    p.t45.setText(Integer.toString(pom));
                else
                    p.t45.setText("0");
                pom = 0;
                p.t45.removeMouseListener(this);
            }
            else if(o == p.t49){
                int k=0;
                if(niz[0] == 0){
                    pom = niz[1];
                } else {
                    pom = niz[0];
                }
                
                for(int i=0;i<niz.length-1;i++){
                    if(pom == niz[i]){
                        k++;
                    }
                }
                if(k>=3){
                    pom = 5*pom;
                    p.t49.setText(Integer.toString(pom));
                } else
                    p.t49.setText("0");
                pom = 0;
                p.t49.removeMouseListener(this);
            }
            if(!o.equals(p.t30) && !o.equals(p.t34)){
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                proveriPrviDeo();

                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
                for(int i=0;i<getNiz().length-1;i++)
                            getNiz()[i]=0;
            }
            rezultat();
        }
        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }
    class Osluskivac2 implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
            if(o == p.t3){
                for(int i:niz)
                    if(i == 1)
                        pom++;
                p.t3.setText(Integer.toString(pom));
                pom = 0;
                p.t3.removeMouseListener(this);
                int rez = Integer.parseInt(p.t3.getText())+Integer.parseInt(p.t7.getText())+Integer.parseInt(p.t11.getText())
                    +Integer.parseInt(p.t15.getText())+ Integer.parseInt(p.t19.getText())+ Integer.parseInt(p.t23.getText());
                p.t27.setText(String.valueOf(rez));
            }
            else if(o == p.t7){
                for(int i:niz)
                    if(i == 2)
                        pom+=2;
                System.out.println(p.t1.getText());
                p.t7.setText(Integer.toString(pom));
                pom = 0;
                p.t7.removeMouseListener(this);
                p.t3.setEditable(true);
                p.t3.addMouseListener(this);
            }
            else if(o == p.t11){
                for(int i:niz)
                    if(i == 3)
                        pom+=3;
                p.t11.setText(Integer.toString(pom));
                pom = 0;
                p.t11.removeMouseListener(this);
                p.t7.setEditable(true);
                p.t7.addMouseListener(this);
            }
            else if(o == p.t15){
                for(int i:niz)
                    if(i == 4)
                        pom+=4;
                p.t15.setText(Integer.toString(pom));
                pom = 0;
                p.t15.removeMouseListener(this);
                p.t11.setEditable(true);
                p.t11.addMouseListener(this);
            }
            else if(o == p.t19){
                for(int i:niz)
                    if(i == 5)
                        pom+=5;
                p.t19.setText(Integer.toString(pom));
                pom = 0;
                p.t19.removeMouseListener(this);
                p.t15.setEditable(true);
                p.t15.addMouseListener(this);
            }
            else if(o == p.t23){
                for(int i:niz)
                    if(i == 6)
                        pom+=6;
                p.t23.setText(Integer.toString(pom));
                pom = 0;
                p.t23.removeMouseListener(this);
                p.t19.setEditable(true);
                p.t19.addMouseListener(this);
            }
            else if(o == p.t31 && cekProvera()){
                for(int i:niz)
                         pom+=i;
                p.t31.setText(Integer.toString(pom));
                pom = 0;
                p.t31.removeMouseListener(this);
                p.t23.setEditable(true);
                p.t23.addMouseListener(this);
                int rez = Integer.parseInt(p.t31.getText())+Integer.parseInt(p.t35.getText());
                p.t59.setText(String.valueOf(rez));
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
            }
            else if(o == p.t35 && cekProvera()){
                for(int i:niz)
                         pom+=i;
                p.t35.setText(Integer.toString(pom));
                pom = 0;
                p.t35.removeMouseListener(this);
                p.t31.setEditable(true);
                p.t31.addMouseListener(this);
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
            } 
            else if(o == p.t39)
            {
                for(int i:niz)
                {
                    if(h.add(i)==true)
                         pom+=i;
                    else 
                    {
                        pom=0;
                        break;
                    }
                }
                if(h.size()-1==5)
                {
                    if(kockice.getBrojac() == 1)
                        p.t39.setText("60");
                    else if(kockice.getBrojac() == 2)
                        p.t39.setText("54");
                    else if(kockice.getBrojac() == 3)
                        p.t39.setText("48");
                }
                else 
                    p.t39.setText("0");
                pom = 0;
                h.removeAll(h);
                p.t39.removeMouseListener(this);
                p.t35.setEditable(true);
                p.t35.addMouseListener(this);
                int rez = Integer.parseInt(p.t50.getText())+Integer.parseInt(p.t39.getText())
                        +Integer.parseInt(p.t42.getText())+Integer.parseInt(p.t46.getText());
                p.t54.setText(String.valueOf(rez));
            }
            else if(o == p.t42)
            {
                int niz[] = new int[6];
                int niz1[] = new int[6];
                int full=0;
                niz[0] = Integer.parseInt(kockice.getL1().getText());
                niz[1] = Integer.parseInt(kockice.getL2().getText());
                niz[2] = Integer.parseInt(kockice.getL3().getText());
                niz[3] = Integer.parseInt(kockice.getL4().getText());
                niz[4] = Integer.parseInt(kockice.getL5().getText());
                niz[5] = Integer.parseInt(kockice.getL6().getText());
                for(int i:niz){
                    if(i == 1) niz1[0]++;if(i == 2) niz1[1]+=1;
                    if(i == 3) niz1[2]+=1;if(i == 4) niz1[3]+=1;
                    if(i == 5) niz1[4]+=1;if(i == 6) niz1[5]+=1;
                }
                for(int i:niz1){
                    if(i==3) full+=3;
                    if(i==2) full+=2;
                }
                if(full==5){
                    if(kockice.getBrojac() == 1)
                        p.t42.setText("60");
                    else if(kockice.getBrojac() == 2)
                        p.t42.setText("54");
                    else if(kockice.getBrojac() == 1)
                        p.t42.setText("48");
                }
                else 
                     p.t42.setText("0");
                p.t42.removeMouseListener(this);
                p.t39.setEditable(true);
                p.t39.addMouseListener(this);
            }
            else if(o == p.t46)
            {
                int broj=0;
                int p1=0;
                for(int i=0;i<niz.length-1;i++){
                    if(niz[i]!=0){
                        p1=niz[i];
                        break;
                    }
                }
                for(int i=0;i<niz.length-1;i++){
                    if(niz[i]==p1){
                        broj++;
                        pom+=niz[i];
                    }
                }
                if(broj==4)
                    p.t46.setText(Integer.toString(pom));
                else
                    p.t46.setText("0");
                pom = 0;
                p.t46.removeMouseListener(this);
                p.t42.setEditable(true);
                p.t42.addMouseListener(this);
            }
            else if(o == p.t50){
                int k=0;
                if(niz[0] == 0){
                    pom = niz[1];
                } else {
                    pom = niz[0];
                }
                
                for(int i=0;i<niz.length-1;i++){
                    if(pom == niz[i]){
                        k++;
                    }
                }
                if(k>=4){
                    pom = 5*pom;
                    p.t50.setText(Integer.toString(pom));
                } else
                    p.t50.setText("0");
                pom = 0;
                p.t50.removeMouseListener(this);
                p.t46.setEditable(true);
                p.t46.addMouseListener(this);
            }
            if(!o.equals(p.t31) && !o.equals(p.t35)){
                kockice.odcekiraj();
                kockice.brojac(0);
                kockice.postaviNule();
                for(int i=0;i<niz.length;i++)
                    niz[i] = 0;
                for(int i:niz)
                    System.out.print(i+" ");
            }
            rezultat();
        }
        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }
    class Osluskivac3 implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent e) {
            Object o = e.getSource();
            if(najava == true){
                if(najavljenoPolje.equals("")){
                    if(o == p.t4){
                        najavljenoPolje = "1";
                    } else if(o == p.t8){
                        najavljenoPolje = "2";
                    } else if(o == p.t12){
                        najavljenoPolje = "3";
                    } else if(o == p.t16){
                        najavljenoPolje = "4";
                    } else if(o == p.t20){
                        najavljenoPolje = "5";
                    } else if(o == p.t24){
                        najavljenoPolje = "6";
                    } else if(o == p.t32){
                        najavljenoPolje = "max";
                    } else if(o == p.t36){
                        najavljenoPolje = "min";
                    } else if(o == p.t40){
                        najavljenoPolje = "K";
                    } else if(o == p.t43){
                        najavljenoPolje = "F";
                    } else if(o == p.t47){
                        najavljenoPolje = "P";
                    } else if(o == p.t51){
                        najavljenoPolje = "J";
                    }
                } else {
                   if(o == p.t4 && najavljenoPolje.equals("1")){
                        for(int i:niz)
                            if(i == 1)
                                pom++;
                        p.t4.setText(Integer.toString(pom));
                        pom = 0;
                        najavljenoPolje = "";
                        p.t4.removeMouseListener(this);
                        proveriPrviDeoZaNajavu();
                    } else if(o == p.t8 && najavljenoPolje.equals("2")){
                        for(int i:niz)
                            if(i == 2)
                                pom+=2;
                        p.t8.setText(Integer.toString(pom));
                        pom = 0;
                        p.t8.removeMouseListener(this);
                        najavljenoPolje = "";
                        proveriPrviDeoZaNajavu();
                    }
                    else if(o == p.t12 && najavljenoPolje.equals("3")){
                        for(int i:niz)
                            if(i == 3)
                                pom+=3;
                        p.t12.setText(Integer.toString(pom));
                        pom = 0;
                        p.t12.removeMouseListener(this);
                        najavljenoPolje = "";
                        proveriPrviDeoZaNajavu();
                    }
                    else if(o == p.t16 && najavljenoPolje.equals("4")) {
                        for(int i:niz)
                            if(i == 4)
                                pom+=4;
                        p.t16.setText(Integer.toString(pom));
                        pom = 0;
                        p.t16.removeMouseListener(this);
                        najavljenoPolje = "";
                        proveriPrviDeoZaNajavu();
                    }
                    else if(o == p.t20 && najavljenoPolje.equals("5")){
                        for(int i:niz)
                            if(i == 5)
                                pom+=5;
                        p.t20.setText(Integer.toString(pom));
                        pom = 0;
                        p.t20.removeMouseListener(this);
                        najavljenoPolje = "";
                        proveriPrviDeoZaNajavu();
                    }
                    else if(o == p.t24 && najavljenoPolje.equals("6")){
                        for(int i:niz)
                            if(i == 6)
                                pom+=6;
                        p.t24.setText(Integer.toString(pom));
                        pom = 0;
                        p.t24.removeMouseListener(this);
                        najavljenoPolje = "";
                        proveriPrviDeoZaNajavu();
                    }
                    else if(o == p.t32 && najavljenoPolje.equals("max") && cekProvera()){
                        for(int i:niz)
                                 pom+=i;
                        p.t32.setText(Integer.toString(pom));
                        pom = 0;
                        p.t32.removeMouseListener(this);
                        najavljenoPolje = "";
                        kockice.odcekiraj();
                        kockice.brojac(0);
                        kockice.postaviNule();
                        najava = false;
                        for(int i=0;i<niz.length;i++)
                            niz[i] = 0;
                        for(int i:niz)
                            System.out.print(i+" ");
                    }
                    else if(o == p.t36 && najavljenoPolje.equals("min") && cekProvera()){
                        for(int i:niz)
                                 pom+=i;
                        p.t36.setText(Integer.toString(pom));
                        pom = 0;
                        p.t36.removeMouseListener(this);
                        najavljenoPolje = "";
                        kockice.odcekiraj();
                        kockice.brojac(0);
                        kockice.postaviNule();
                        najava = false;
                        for(int i=0;i<niz.length;i++)
                            niz[i] = 0;
                        for(int i:niz)
                            System.out.print(i+" ");
                    }
                    else if(o == p.t40 && najavljenoPolje.equals("K")){
                        for(int i:niz)
                        {
                            if(h.add(i)==true)
                                 pom+=i;
                            else 
                            {
                                pom=0;
                                break;
                            }
                        }
                        if(h.size()-1==5){
                            if(kockice.getBrojac() == 1)
                                p.t40.setText("60");
                            else if(kockice.getBrojac() == 2)
                                p.t40.setText("54");
                            else if(kockice.getBrojac() == 3)
                                p.t40.setText("48");
                        }
                        else 
                            p.t40.setText("0");
                        pom = 0;
                        p.t40.removeMouseListener(this);
                        najavljenoPolje = "";
                        h.removeAll(h);
                    }
                    else if(o == p.t43 && najavljenoPolje.equals("F")){
                        int niz[] = new int[6];
                        int niz1[] = new int[6];
                        int full=0;
                        niz[0] = Integer.parseInt(kockice.getL1().getText());
                        niz[1] = Integer.parseInt(kockice.getL2().getText());
                        niz[2] = Integer.parseInt(kockice.getL3().getText());
                        niz[3] = Integer.parseInt(kockice.getL4().getText());
                        niz[4] = Integer.parseInt(kockice.getL5().getText());
                        niz[5] = Integer.parseInt(kockice.getL6().getText());
                        for(int i:niz)
                        {
                            if(i == 1) niz1[0]++;if(i == 2) niz1[1]+=1;
                            if(i == 3) niz1[2]+=1;if(i == 4) niz1[3]+=1;
                            if(i == 5) niz1[4]+=1;if(i == 6) niz1[5]+=1;
                        }
                        for(int i:niz1)
                        {
                            if(i==3) full+=3;
                            if(i==2) full+=2;
                        }
                        if(full==5)
                        {
                            if(kockice.getBrojac() == 1)
                                p.t43.setText("60");
                            else if(kockice.getBrojac() == 2)
                                p.t43.setText("54");
                            else if(kockice.getBrojac() == 1)
                                p.t43.setText("48");
                        }
                        else 
                             p.t43.setText("0");
                        p.t43.removeMouseListener(this);
                        najavljenoPolje = "";
                    } else if (o == p.t47 && najavljenoPolje.equals("P")){
                        int broj=0;
                        int p1=0;
                        for(int i=0;i<niz.length-1;i++)
                        {
                            if(niz[i]!=0)
                            {
                                p1=niz[i];
                                break;
                            }
                        }
                        for(int i=0;i<niz.length-1;i++)
                        {
                            if(niz[i]==p1)
                            {
                                broj++;
                                pom+=niz[i];
                            }
                        }
                        if(broj==4)
                            p.t47.setText(Integer.toString(pom));
                        else
                            p.t47.setText("0");
                        pom = 0;
                        p.t47.removeMouseListener(this);
                        najavljenoPolje = "";
                    } else if(o == p.t51 && najavljenoPolje.equals("J")) {
                        int k=0;
                        if(niz[0] == 0){
                            pom = niz[1];
                        } else {
                            pom = niz[0];
                        }

                        for(int i=0;i<niz.length-1;i++){
                            if(pom == niz[i]){
                                k++;
                            }
                        }
                        if(k>=4){
                            pom = 5*pom;
                            p.t51.setText(Integer.toString(pom));
                        } else
                            p.t51.setText("0");
                        pom = 0;
                        p.t51.removeMouseListener(this);
                        najavljenoPolje = "";
                    }
                   if(!o.equals(p.t32) && !o.equals(p.t36)){
                        kockice.odcekiraj();
                        kockice.brojac(0);
                        kockice.postaviNule();
                        najava = false;
                        for(int i=0;i<niz.length;i++)
                            niz[i] = 0;
                        for(int i:niz)
                            System.out.print(i+" ");
                   }
                } 
                if(kockice.getBrojac() == 0 && !o.equals(p.t32) && !o.equals(p.t36)){
                    kockice.odcekiraj();
                    kockice.brojac(0);
                    kockice.postaviNule();
                    najava = false;
                    for(int i=0;i<niz.length;i++)
                        niz[i] = 0;
                    for(int i:niz)
                        System.out.print(i+" ");
                }
                rezultat();
            }
            
        }
        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }
    public static int[] getNiz() {
        return niz;
    }
    public static void setNajava(boolean najava) {
        Tabla.najava = najava;
    }
    public void proveriPrviDeo(){
        if(!p.t2.getText().equals("") && !p.t6.getText().equals("") && !p.t10.getText().equals("")
                && !p.t14.getText().equals("") && !p.t18.getText().equals("") && !p.t22.getText().equals("")){
            int rez = (Integer.parseInt(p.t2.getText()) + Integer.parseInt(p.t6.getText()) + Integer.parseInt(p.t10.getText())
                    + Integer.parseInt(p.t14.getText()) + Integer.parseInt(p.t18.getText()) + Integer.parseInt(p.t22.getText()));
            p.t26.setText(String.valueOf(rez));
        }
    }
    public void proveriPrviDeoZaNajavu(){
        if(!p.t4.getText().equals("") && !p.t8.getText().equals("") && !p.t12.getText().equals("")
                && !p.t16.getText().equals("") && !p.t20.getText().equals("") && !p.t24.getText().equals("")){
            int rez = (Integer.parseInt(p.t4.getText()) + Integer.parseInt(p.t8.getText()) + Integer.parseInt(p.t12.getText())
                    + Integer.parseInt(p.t16.getText()) + Integer.parseInt(p.t20.getText()) + Integer.parseInt(p.t24.getText()));
            p.t28.setText(String.valueOf(rez));
        }
    }
    public void proveriDrugiDeoZaNajavu(){
        if( !p.t32.equals("") && !p.t36.equals("")){
            int rez = Integer.parseInt(p.t32.getText()) + Integer.parseInt(p.t36.getText());
            p.t60.setText(String.valueOf(rez));
        }
    }
    public boolean cekProvera(){
        int brojac = 0;
        for(int i: niz){
            if(i != 0)
                brojac++;
        }
        if(brojac == 5)
            return true;
        else 
            return false;
    }
    public void rezultat(){
        if(!p.t21.equals("") && !p.t22.equals("") && !p.t23.equals("") && !p.t24.equals("")
            && !p.t33.equals("") && !p.t34.equals("") && !p.t35.equals("") && !p.t36.equals("")
            && !p.t52.equals("") && !p.t53.equals("") && !p.t54.equals("") && !p.t56.equals(""))
        {
            int rezultat = Integer.parseInt(p.t21.getText()) + Integer.parseInt(p.t22.getText())
                    + Integer.parseInt(p.t23.getText()) + Integer.parseInt(p.t24.getText())
                    + Integer.parseInt(p.t33.getText()) + Integer.parseInt(p.t34.getText())
                    + Integer.parseInt(p.t35.getText()) + Integer.parseInt(p.t36.getText())
                    + Integer.parseInt(p.t52.getText()) + Integer.parseInt(p.t53.getText())
                    + Integer.parseInt(p.t54.getText()) + Integer.parseInt(p.t56.getText());
            System.out.println("VAS REZULTAT JE : "+rezultat);
        }
    }
}
