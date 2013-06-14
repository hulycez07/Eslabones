//nombre del paquete
//package mx.uabcs.programaciongui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;

public class DemoDibujo extends JFrame{

	final static Color BG=Color.green;
	final static Color FG=Color.black;
	
	public DemoDibujo(){
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//metodo init para inicializar
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}

	//metodo paint para ael dibujado de elementos
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D) g;
		g2.setPaint(Color.BLACK);
		Polygon poly=new Polygon();
		
		poly.addPoint(45, 200);
		poly.addPoint(70, 210);
		poly.addPoint(70,  350);
		poly.addPoint(45,  340);
		
	g2.fillPolygon(poly);
	
	g2.setPaint(Color.GRAY);
	Polygon poly2=new Polygon();
	
	poly2.addPoint(45, 200);
	poly2.addPoint(70, 210);
	poly2.addPoint(135, 170);
	poly2.addPoint(110, 160);
	
    g2.fillPolygon(poly2);
    
    g2.setPaint(Color.BLACK);
	Polygon poly3=new Polygon();
	
	poly3.addPoint(110, 160);
	poly3.addPoint(80, 148);
	poly3.addPoint(80, 168);
	poly3.addPoint(90, 173);
	
    g2.fillPolygon(poly3);
    
    g2.setPaint(Color.BLACK);
	Polygon poly4=new Polygon();
	
	poly4.addPoint(135, 170);
	poly4.addPoint(165, 183);
	poly4.addPoint(165, 203);
	poly4.addPoint(135, 190);
	
    g2.fillPolygon(poly4);
    
    g2.setPaint(Color.GRAY);
	Polygon poly5=new Polygon();
	
	poly5.addPoint(80, 150);
	poly5.addPoint(220,60);
	poly5.addPoint(270, 85);
	poly5.addPoint(270, 115);
	poly5.addPoint(285, 125);
	poly5.addPoint(165, 183);
	poly5.addPoint(145, 175);
	poly5.addPoint(215, 140);
	poly5.addPoint(165, 120);
	poly5.addPoint(105, 158);

    g2.fillPolygon(poly5);
    
    
    g2.setPaint(Color.GRAY);
	Polygon poly6=new Polygon();
	
	poly6.addPoint(105, 158);
	poly6.addPoint(145, 175);
	poly6.addPoint(165, 165);
	poly6.addPoint(120, 148);
	
    g2.fillPolygon(poly6);
    
    g2.setPaint(Color.BLUE);
	Polygon poly7=new Polygon();
	
	poly7.addPoint(165, 120);
	poly7.addPoint(165, 145);
	poly7.addPoint(143, 157);
	poly7.addPoint(120, 148);
	
    g2.fillPolygon(poly7);
    
    g2.setPaint(Color.BLACK);
	Polygon poly8=new Polygon();
	
	poly8.addPoint(165, 120);
	poly8.addPoint(165, 145);
	poly8.addPoint(190, 153);
	poly8.addPoint(215, 140);
	
    g2.fillPolygon(poly8);
    
    g2.setPaint(Color.BLUE);
	Polygon poly9=new Polygon();
	
	poly9.addPoint(165, 183);
	poly9.addPoint(165, 203);
	poly9.addPoint(285, 145);
	poly9.addPoint(285, 125);
	
    g2.fillPolygon(poly9);
    
    g2.setPaint(Color.BLUE);
	Polygon poly10=new Polygon();
	
	poly10.addPoint(155, 198);
	poly10.addPoint(155, 290);
	poly10.addPoint(135, 298);
	poly10.addPoint(135, 190);
	
    g2.fillPolygon(poly10);
    
    g2.setPaint(Color.BLUE);
	Polygon poly11=new Polygon();
	
	poly11.addPoint(70, 210);
	poly11.addPoint(135, 170);
	poly11.addPoint(135, 240);
	poly11.addPoint(70, 280);
	
    g2.fillPolygon(poly11);
    
    g2.setPaint(Color.BLUE);
	Polygon poly12=new Polygon();

	poly12.addPoint(70, 280);
	poly12.addPoint(90, 267);
	poly12.addPoint(90, 335);
	poly12.addPoint(70, 350);
	
    g2.fillPolygon(poly12);
    
    g2.setPaint(Color.BLUE);
	Polygon poly14=new Polygon();
	
	poly14.addPoint(90, 322);
	poly14.addPoint(100, 315);
	poly14.addPoint(100, 328);
	poly14.addPoint(90, 335);
	
    g2.fillPolygon(poly14);
    
    g2.setPaint(Color.BLUE);
	Polygon poly15=new Polygon();
	
	poly15.addPoint(135, 298);
	poly15.addPoint(155, 280);
	poly15.addPoint(155, 305);
	poly15.addPoint(140, 310);
	poly15.addPoint(125, 305);
	
	g2.fillPolygon(poly15);
	
	 g2.setPaint(Color.BLACK);
	Polygon poly16=new Polygon();
		
	poly16.addPoint(120, 249);
	poly16.addPoint(135, 240);
	poly16.addPoint(135, 300);
	poly16.addPoint(120, 280);
		
	g2.fillPolygon(poly16);
		
	g2.setPaint(Color.GRAY);
	Polygon poly17=new Polygon();
			
	poly17.addPoint(135, 300);
	poly17.addPoint(90, 322);
	poly17.addPoint(90, 293);
	poly17.addPoint(120, 280);
			
	g2.fillPolygon(poly17);
	
	
	
	g2.setPaint(Color.BLACK);
	Polygon poly19=new Polygon();
			
	poly19.addPoint(100, 317);
	poly19.addPoint(100, 328);
	poly19.addPoint(80, 342);
	poly19.addPoint(80, 400);
	poly19.addPoint(200, 440);
	poly19.addPoint(200, 418);
	poly19.addPoint(150, 400);
	poly19.addPoint(150, 360);
	poly19.addPoint(200, 375);
	poly19.addPoint(200, 355);
			
	g2.fillPolygon(poly19);

	g2.setPaint(Color.BLACK);
	Polygon poly20=new Polygon();
			
	poly20.addPoint(200, 440);
	poly20.addPoint(200, 355);
	poly20.addPoint(220, 362);
	poly20.addPoint(220, 447);
	
	g2.fillPolygon(poly20);
	
	g2.setPaint(Color.GRAY);
	Polygon poly21=new Polygon();
			
	poly21.addPoint(200, 418);
	poly21.addPoint(150, 400);
	poly21.addPoint(170, 387);
	poly21.addPoint(200, 395);
	
	g2.fillPolygon(poly21);
	
	g2.setPaint(Color.BLUE);
	Polygon poly22=new Polygon();
			
	poly22.addPoint(150, 400);
	poly22.addPoint(170, 387);
	poly22.addPoint(170, 365);
	poly22.addPoint(150, 360);
	
	g2.fillPolygon(poly22);
	
	g2.setPaint(Color.GRAY);
	Polygon poly23=new Polygon();
	
	poly23.addPoint(100, 317);
	poly23.addPoint(126, 304);
	poly23.addPoint(230, 345);
	poly23.addPoint(220, 363);

	g2.fillPolygon(poly23);
	
	g2.setPaint(Color.BLUE);
	Polygon poly24=new Polygon();
	
	poly24.addPoint(220, 363);
	poly24.addPoint(230, 345);
	poly24.addPoint(231, 390);
	poly24.addPoint(220, 400);

	g2.fillPolygon(poly24);
	
	g2.setPaint(Color.BLUE);
	Polygon poly25=new Polygon();
	
	poly25.addPoint(220, 420);
	poly25.addPoint(230, 424);
	poly25.addPoint(230, 440);
	poly25.addPoint(220, 448);

	g2.fillPolygon(poly25);
	
	g2.setPaint(Color.BLACK);
	Polygon poly26=new Polygon();
	
	poly26.addPoint(220, 420);
	poly26.addPoint(220, 399);
	poly26.addPoint(285, 426);
	poly26.addPoint(285, 446);

	g2.fillPolygon(poly26);
	
	g2.setPaint(Color.GRAY);
	Polygon poly27=new Polygon();
	
	poly27.addPoint(220, 399);
	poly27.addPoint(231, 390);
	poly27.addPoint(231, 370);
	poly27.addPoint(325, 328);
	poly27.addPoint(347, 340);
	poly27.addPoint(290, 365);
	poly27.addPoint(335, 383);
	poly27.addPoint(390, 360);
	poly27.addPoint(410, 369);
	poly27.addPoint(285, 426);
	
	g2.fillPolygon(poly27);
	
	g2.setPaint(Color.GRAY);
	Polygon poly28=new Polygon();
	
	poly28.addPoint(325, 328);
	poly28.addPoint(338, 324);
	poly28.addPoint(350, 330);
	poly28.addPoint(351, 346);

	g2.fillPolygon(poly28);
	
	g2.setPaint(Color.BLACK);
	Polygon poly29=new Polygon();
	
	poly29.addPoint(343, 341);
	poly29.addPoint(389, 361);
	poly29.addPoint(370, 369);
	poly29.addPoint(342, 360);

	g2.fillPolygon(poly29);
	
	g2.setPaint(Color.BLUE);
	Polygon poly30=new Polygon();
	
	poly30.addPoint(343, 341);
	poly30.addPoint(343, 360);
	poly30.addPoint(315, 375);
	poly30.addPoint(290, 365);

	g2.fillPolygon(poly30);
	
	g2.setPaint(Color.GRAY);
	Polygon poly31=new Polygon();
	
	poly31.addPoint(390, 362);
	poly31.addPoint(375, 355);
	poly31.addPoint(393, 346);
	poly31.addPoint(425, 361);
	poly31.addPoint(409, 369);

	g2.fillPolygon(poly31);
	
	g2.setPaint(Color.BLUE);
	Polygon poly32=new Polygon();
	
	poly32.addPoint(285, 426);
	poly32.addPoint(425, 361);
	poly32.addPoint(425, 379);
	poly32.addPoint(285, 447);

	g2.fillPolygon(poly32);
	
	g2.setPaint(Color.BLACK);
	Polygon poly33=new Polygon();
	
	poly33.addPoint(375, 355);
	poly33.addPoint(351, 346);
	poly33.addPoint(351, 240);
	poly33.addPoint(375, 250);

	g2.fillPolygon(poly33);  
	
	g2.setPaint(Color.BLUE);
	Polygon poly34=new Polygon();
	
	poly34.addPoint(375, 355);
	poly34.addPoint(375, 265);
	poly34.addPoint(400, 250);
	poly34.addPoint(400, 320);
	poly34.addPoint(440, 295);
	poly34.addPoint(440, 234);
	poly34.addPoint(470, 220);
	poly34.addPoint(470, 330);
	poly34.addPoint(415, 357);
	poly34.addPoint(393, 346);
	
	g2.fillPolygon(poly34); 
	
	g2.setPaint(Color.BLUE);
	Polygon poly35=new Polygon();
	
	poly35.addPoint(375, 265);
	poly35.addPoint(470, 220);
	poly35.addPoint(470, 205);
	poly35.addPoint(375, 250);

	g2.fillPolygon(poly35);
	
	g2.setPaint(Color.BLACK);
	Polygon poly36=new Polygon();
	
	poly36.addPoint(416, 246);
	poly36.addPoint(440, 234);
	poly36.addPoint(440, 296);
	poly36.addPoint(416, 271);

	g2.fillPolygon(poly36);
	
	g2.setPaint(Color.GRAY);
	Polygon poly37=new Polygon();
	
	poly37.addPoint(416, 271);
	poly37.addPoint(440, 296);
	poly37.addPoint(400, 320);
	poly37.addPoint(400, 281);

	g2.fillPolygon(poly37);
    
	g2.setPaint(Color.GRAY);
	Polygon poly38=new Polygon();
	
	poly38.addPoint(351, 240);
	poly38.addPoint(375, 223);
	poly38.addPoint(410, 234);
	poly38.addPoint(375, 250);

	g2.fillPolygon(poly38);
	
	g2.setPaint(Color.GRAY);
	Polygon poly39=new Polygon();
	
	poly39.addPoint(428, 226);
	poly39.addPoint(423, 195);
	poly39.addPoint(435, 188);
	poly39.addPoint(470, 205);

	g2.fillPolygon(poly39);
	
	g2.setPaint(Color.BLUE);
	Polygon poly40=new Polygon();
	
	poly40.addPoint(408, 234);
	poly40.addPoint(428, 226);
	poly40.addPoint(427, 145);
	poly40.addPoint(408, 160);

	g2.fillPolygon(poly40);
	
	g2.setPaint(Color.BLACK);
	Polygon poly41=new Polygon();
	
	poly41.addPoint(409, 234);
	poly41.addPoint(376, 223);
	poly41.addPoint(357, 237);
	poly41.addPoint(285, 180);
	poly41.addPoint(285, 150);
	poly41.addPoint(335, 187);
	poly41.addPoint(335, 144);
	poly41.addPoint(285, 105);
	poly41.addPoint(285, 70);
	poly41.addPoint(408, 160);

	g2.fillPolygon(poly41);
	
	g2.setPaint(Color.BLACK);
	Polygon poly42=new Polygon();
	
	poly42.addPoint(285, 180);
	poly42.addPoint(285, 145);
	poly42.addPoint(270, 152);
	poly42.addPoint(270, 165);

	g2.fillPolygon(poly42);
	
	g2.setPaint(Color.BLACK);
	Polygon poly43=new Polygon();
	
	poly43.addPoint(285, 70);
	poly43.addPoint(285, 125);
	poly43.addPoint(270, 115);
	poly43.addPoint(270, 60);

	g2.fillPolygon(poly43);
	
	g2.setPaint(Color.GRAY);
	Polygon poly44=new Polygon();
	
	poly44.addPoint(270, 60);
	poly44.addPoint(408, 160);
	poly44.addPoint(427, 145);
	poly44.addPoint(290, 45);

	g2.fillPolygon(poly44);
	
	g2.setPaint(Color.GRAY);
	Polygon poly45=new Polygon();
	
	poly45.addPoint(285, 150);
	poly45.addPoint(335, 187);
	poly45.addPoint(335, 165);
	poly45.addPoint(300, 140);

	g2.fillPolygon(poly45);
	
	g2.setPaint(Color.BLUE);
	Polygon poly46=new Polygon();
	
	poly46.addPoint(285, 150);
	poly46.addPoint(300, 140);
	poly46.addPoint(300, 115);
	poly46.addPoint(285, 105);

	g2.fillPolygon(poly46);
	
	
		
	}

}
