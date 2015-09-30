/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitales.principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Punto Crítiko
 */
public class Interface extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group1 = new javax.swing.ButtonGroup();
        Group2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CheckDecimal1 = new javax.swing.JCheckBox();
        CheckBin1 = new javax.swing.JCheckBox();
        CheckOct1 = new javax.swing.JCheckBox();
        CheckHex1 = new javax.swing.JCheckBox();
        CheckBCD1 = new javax.swing.JCheckBox();
        TextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CheckDec2 = new javax.swing.JCheckBox();
        CheckBin2 = new javax.swing.JCheckBox();
        CheckOct2 = new javax.swing.JCheckBox();
        CheckHex2 = new javax.swing.JCheckBox();
        CheckBCD2 = new javax.swing.JCheckBox();
        BotonLimpiar = new javax.swing.JButton();
        BotonConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Group1.add(CheckDecimal1);
        CheckDecimal1.setText("Decimal");
        CheckDecimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDecimal1ActionPerformed(evt);
            }
        });

        Group1.add(CheckBin1);
        CheckBin1.setText("Binario");
        CheckBin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBin1ActionPerformed(evt);
            }
        });

        Group1.add(CheckOct1);
        CheckOct1.setText("Octal");

        Group1.add(CheckHex1);
        CheckHex1.setText("Hexadecimal");

        Group1.add(CheckBCD1);
        CheckBCD1.setText("BCD");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero Convertido:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona la Base de tu Numero:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingresa el Numero a Convertir:");

        TextField2.setEditable(false);
        TextField2.setBackground(new java.awt.Color(255, 255, 255));
        TextField2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Selecciona la Base a Convertir:");

        Group2.add(CheckDec2);
        CheckDec2.setText("Decimal");
        CheckDec2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckDec2StateChanged(evt);
            }
        });

        Group2.add(CheckBin2);
        CheckBin2.setText("Binario");

        Group2.add(CheckOct2);
        CheckOct2.setText("Octal");

        Group2.add(CheckHex2);
        CheckHex2.setText("Hexadecimal");
        CheckHex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckHex2ActionPerformed(evt);
            }
        });

        Group2.add(CheckBCD2);
        CheckBCD2.setText("BCD");

        BotonLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonConvertir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonConvertir.setText("Convertir");
        BotonConvertir.setMaximumSize(new java.awt.Dimension(69, 23));
        BotonConvertir.setMinimumSize(new java.awt.Dimension(69, 23));
        BotonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckOct1)
                            .addComponent(CheckHex1)
                            .addComponent(CheckBin1)
                            .addComponent(CheckDecimal1)
                            .addComponent(CheckBCD1))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBin2)
                    .addComponent(CheckBCD2)
                    .addComponent(CheckHex2)
                    .addComponent(CheckDec2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckOct2)
                    .addComponent(BotonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(TextField2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckDec2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckBin2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckOct2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckHex2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckBCD2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CheckDecimal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckBin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckOct1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckHex1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckBCD1)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
       TextField1.setText("");   // TODO add your handling code here:;
             TextField2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConvertirActionPerformed
    	if(CheckOct1.isSelected() && CheckBCD2.isSelected()){
    		int control = 0;
    		int ctrl = 1;
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = null;
    		String resultadoenDecimal = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				control =1;
    				break;
    			}
    		}
    		respuestaEntera = Conversions.COctalDecimalEntero(TextField1.getText().substring(0, point));
    		if(control ==1)
    		{
    		respuestaFraccion = Conversions.COctalDecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
    		if(respuestaFraccion.compareTo("Error") == 0 || respuestaEntera.compareTo("Error") == 0)
    		{
    			TextField2.setText("Error, checa tu entrada");
    			ctrl = 0;
    		}
    		else
    			resultadoenDecimal = respuestaEntera + "." + respuestaFraccion;
    		}
    		else
    			if(respuestaEntera.compareTo("Error") == 0){
    				TextField2.setText("Error, checa tu entrada");
    				ctrl = 0;
    			}
    			else
    				resultadoenDecimal = respuestaEntera;	
    		if(ctrl == 1)
    		{
    			point=resultadoenDecimal.length() ;
    			for(int i =0; i < resultadoenDecimal.length(); i++){
    				if(resultadoenDecimal.charAt(i) == '.'){
    					point=i;
    					control =1;
    					break;
    				}
    			}
    			
        		try {
					respuestaEntera = Conversions.CDecimalBCDEntero(resultadoenDecimal.substring(0, point));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}
        		if (control ==1)
        		{
        			try {
						respuestaFraccion = Conversions.CDecimalBCDFraccion(resultadoenDecimal.substring(point + 1, resultadoenDecimal.length()));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
					}
        			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
        		}
        		else
        			TextField2.setText(respuestaEntera);
        		
    			
    		}
    		else
    			TextField2.setText("Error en la entrada");
    	}
    	
    	if(CheckOct1.isSelected() && CheckBin2.isSelected()){
    		int control = 0;
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion;
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				control =1;
    				break;
    			}
    		}		
    		respuestaEntera = Conversions.COctalBinarioEntero(TextField1.getText().substring(0, point));
    		if(control ==1)
    			{
    			respuestaFraccion = Conversions.COctalBinarioFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
    			if(respuestaFraccion.compareTo("Error") == 0 || respuestaEntera.compareTo("Error") == 0)
    				TextField2.setText("Error, checa tu entrada");
    			else
    			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
    		}
    		else
    			if(respuestaEntera.compareTo("Error") == 0)
    				TextField2.setText("Error, checa tu entrada");
    			else
    				TextField2.setText(respuestaEntera);

    	}
    	
    	
    	if(CheckOct1.isSelected() && CheckDec2.isSelected()){
    		int control = 0;
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion;
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				control =1;
    				break;
    			}
    		}
    		respuestaEntera = Conversions.COctalDecimalEntero(TextField1.getText().substring(0, point));
    		if(control ==1)
    		{
    		respuestaFraccion = Conversions.COctalDecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
    		if(respuestaFraccion.compareTo("Error") == 0 || respuestaEntera.compareTo("Error") == 0)
    			TextField2.setText("Error, checa tu entrada");
    		else
    			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
    		}
    		else
    			if(respuestaEntera.compareTo("Error") == 0)
    				TextField2.setText("Error, checa tu entrada");
    			else
    				TextField2.setText(respuestaEntera);	
    	}
    	
    	if(CheckOct1.isSelected() && CheckHex2.isSelected())
    	{
    		int control = 0;
    		int ctrl = 1;
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = null;
    		String resultadoenDecimal = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				control =1;
    				break;
    			}
    		}
    		respuestaEntera = Conversions.COctalDecimalEntero(TextField1.getText().substring(0, point));
    		if(control ==1)
    		{
    		respuestaFraccion = Conversions.COctalDecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
    		if(respuestaFraccion.compareTo("Error") == 0 || respuestaEntera.compareTo("Error") == 0)
    		{
    			TextField2.setText("Error, checa tu entrada");
    			ctrl = 0;
    		}
    		else
    			resultadoenDecimal = respuestaEntera + "." + respuestaFraccion;
    		}
    		else
    			if(respuestaEntera.compareTo("Error") == 0){
    				TextField2.setText("Error, checa tu entrada");
    				ctrl = 0;
    			}
    			else
    				resultadoenDecimal = respuestaEntera;	
    		if(ctrl == 1)
    		{
    			point=resultadoenDecimal.length() ;
    			for(int i =0; i < resultadoenDecimal.length(); i++){
    				if(resultadoenDecimal.charAt(i) == '.'){
    					point=i;
    					control =1;
    					break;
    				}
    			}
    			
        		try {
					respuestaEntera = Conversions.CDecimalHexadecimalEntero(resultadoenDecimal.substring(0, point));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}
        		if (control ==1)
        		{
        			try {
						respuestaFraccion = Conversions.CDecimalHexadecimalFraccion(resultadoenDecimal.substring(point + 1, resultadoenDecimal.length()));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
					}
        			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
        		}
        		else
        			TextField2.setText(respuestaEntera);
        		
    			
    		}
    		else
    			TextField2.setText("Error en la entrada");
    	}
    	
    	
    	if(CheckOct1.isSelected() && CheckOct2.isSelected())
    	{
    		int cont = 1;
    		int control = 1;
    		int point=TextField1.getText().length() ;
    		String temp;
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				control =0;
    				break;
    			}
    		}
    		for(int i=0;i<TextField1.getText().substring(0, point).length() ;i++)
    		{
    			temp = TextField1.getText().substring(0, point).charAt(i) + "";
    			if(Integer.parseInt(temp) > 7 ){
    				cont = 0;
    				control=1;
    				break;
    			}
    			cont=1;
    		}
    		if(control == 0){
    		for(int i=0;i < TextField1.getText().substring(point+1).length();i++)
    		{
    			temp = TextField1.getText().substring(point+1).charAt(i) + "";
    			if(Integer.parseInt(temp) > 7 ){
    				cont = 0;
    				break;
    			}
    			cont=1;
    		}
    		}
    		if (cont==0)
    			TextField2.setText("Error, checa tu entrada");
    		else
    			TextField2.setText(TextField1.getText());
    	}


    	
        // TODO add your handling code here:

    	//System.out.println("Hola");
    	
    	//Decimal to Binary
    	if(CheckDecimal1.isSelected() && CheckBin2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
    		
    		try{
    			respuestaEntera    = Conversions.CDecimalBinarioEntero(TextField1.getText().substring(0, point));
    			System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
    			if(point < TextField1.getText().length())
    				respuestaFraccion = Conversions.CDecimalBinarioFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
    		
    			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
    		}catch(Exception e){
    			e.printStackTrace();
				JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
    		}
    		
    	}
    	
    	//Decimal to Hexadecimal

    	if(CheckDecimal1.isSelected() && CheckHex2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
    		
    		try{
    			respuestaEntera    = Conversions.CDecimalHexadecimalEntero(TextField1.getText().substring(0, point));
    			System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
    			if(point < TextField1.getText().length())
    				respuestaFraccion = Conversions.CDecimalHexadecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
    		
    			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
    		}catch(Exception e){
    			e.printStackTrace();
				JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
    		}
    		
    	}
    	//Decimal to BCD
    	if(CheckDecimal1.isSelected() && CheckBCD2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
    		
    		try{
    			respuestaEntera    = Conversions.CDecimalBCDEntero(TextField1.getText().substring(0, point));
    			System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
    			if(point < TextField1.getText().length())
    				respuestaFraccion = Conversions.CDecimalBCDFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
    		
    			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
    		}catch(Exception e){
    			e.printStackTrace();
				JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
    		}
    		
    	}
    	

    	if(CheckBCD1.isSelected() && CheckDec2.isSelected()){

    	//Hexadecimal to binario
    	if(CheckHex1.isSelected() && CheckBin2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
    		
    		try{
    			respuestaEntera    = Conversions.CHexadecimalBinarioEntero(TextField1.getText().substring(0, point).toUpperCase());
    			System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
    			if(point < TextField1.getText().length())
    				respuestaFraccion = Conversions.CHexadecimalBinarioFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()).toUpperCase());
    		

    			TextField2.setText(respuestaEntera + "." + respuestaFraccion);
    		}catch(Exception e){
    			e.printStackTrace();
				JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
    		}
    		
    	}
    		
    	
    	
    	//BINARIO A BINARIO
    	
    	if(CheckBin1.isSelected() && CheckBin2.isSelected())
		{		
			int point=TextField1.getText().length();
			String respuestaEntera;
			String respuestaFraccion;
			
			for(int i =0; i < TextField1.getText().length(); i++){
				if(TextField1.getText().charAt(i) == '.'){
					point=i;
					break;
				}
			}
			
			respuestaEntera = TextField1.getText().substring(0, point);
    		respuestaFraccion = TextField1.getText().substring(point + 1, TextField1.getText().length());
    		TextField2.setText(respuestaEntera + "." + respuestaFraccion);  
		}		
    	
    	
    	//BINARIO A DECIMAL
    	
    	if(CheckBin1.isSelected() && CheckDec2.isSelected())
		{		
			int point=TextField1.getText().length();
			String respuestaEntera;
			String respuestaFraccion;
			int cont =0;
			for(int i =0; i < TextField1.getText().length(); i++){
				if(TextField1.getText().charAt(i) == '.'){
					point=i;
					cont=1;
					break;
				}
			}		
			try{
				if(cont == 0)
				{
					respuestaEntera = Conversions.CBinarioDecimalEntero(TextField1.getText().substring(0, point));
					TextField2.setText(respuestaEntera);
				}
				if(cont == 1)
				{
					if(TextField1.getText().substring(0, point).equals(""))
					{
						respuestaFraccion = Conversions.CBinarioDecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
						TextField2.setText("0." + respuestaFraccion);
					}
					else
					{
						respuestaEntera = Conversions.CBinarioDecimalEntero(TextField1.getText().substring(0, point));
						respuestaFraccion = Conversions.CBinarioDecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
						TextField2.setText(respuestaEntera + "." + respuestaFraccion);
					}
								
				}			
			}
			
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "El numero introducido es incorrecto");
			}
		}    	
    	
    	//BINARIO A OCTAL
    	
    	if(CheckBin1.isSelected() && CheckOct2.isSelected())
		{		
			int point=TextField1.getText().length();
			String respuestaEntera;
			String respuestaFraccion;
			int cont =0;
			for(int i =0; i < TextField1.getText().length(); i++){
				if(TextField1.getText().charAt(i) == '.'){
					point=i;
					cont=1;
					break;
				}
			}		
			try{
				if(cont == 0)
				{
					respuestaEntera = Conversions.CBinarioOctalEntero(TextField1.getText().substring(0, point));
					TextField2.setText(respuestaEntera);
				}
				if(cont == 1)
				{
					if(TextField1.getText().substring(0, point).equals(""))
					{
						respuestaFraccion = Conversions.CBinarioOctalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
						TextField2.setText("0." + respuestaFraccion);
					}
					else
					{
						respuestaEntera = Conversions.CBinarioOctalEntero(TextField1.getText().substring(0, point));
						respuestaFraccion = Conversions.CBinarioOctalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
						TextField2.setText(respuestaEntera + "." + respuestaFraccion);
					}
								
				}			
			}
			
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "El numero introducido es incorrecto");
			}
		}    	
    	  	  	
    	//BINARIO A HEXA
    	
    	if(CheckBin1.isSelected() && CheckHex2.isSelected())
		{		
			int point=TextField1.getText().length();
			String respuestaEntera;
			String respuestaFraccion;
			int cont =0;
			for(int i =0; i < TextField1.getText().length(); i++){
				if(TextField1.getText().charAt(i) == '.'){
					point=i;
					cont=1;
					break;
				}
			}		
			try{
				if(cont == 0)
				{
					respuestaEntera = Conversions.CBinarioHexaEntero(TextField1.getText().substring(0, point));
					TextField2.setText(respuestaEntera);
				}
				if(cont == 1)
				{
					if(TextField1.getText().substring(0, point).equals(""))
					{
						respuestaFraccion = Conversions.CBinarioHexaFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
						TextField2.setText("0." + respuestaFraccion);
					}
					else
					{
						respuestaEntera = Conversions.CBinarioHexaEntero(TextField1.getText().substring(0, point));
						respuestaFraccion = Conversions.CBinarioHexaFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
						TextField2.setText(respuestaEntera + "." + respuestaFraccion);
					}
								
				}			
			}
			
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "El numero introducido es incorrecto");
			}
		}  
    	
    	}//GEN-LAST:event_BotonConvertirActionPerformed
    		
    	
    	//BCD to Decimal
    	if(CheckBCD1.isSelected() && CheckDec2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
				try {
					respuestaEntera    = Conversions.CBcdDecimalEntero(TextField1.getText().substring(0, point));
			// + "." + respuestaFraccion);
					System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
					if(point < TextField1.getText().length())
						respuestaFraccion = Conversions.CBcdDecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
					TextField2.setText(respuestaEntera + "." + respuestaFraccion);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}	
    	}
    	
    	//BCD to Binary
    	if(CheckBCD1.isSelected() && CheckBin2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
				try {
					respuestaEntera    = Conversions.CBcdBinarioEntero(TextField1.getText().substring(0, point));
			// + "." + respuestaFraccion);
					//System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
					if(point < TextField1.getText().length())
						respuestaFraccion = Conversions.CBcdBinarioFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
					TextField2.setText(respuestaEntera + "." + respuestaFraccion);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}	
    	}
    	
    	
    	//BCD to Hexadecimal
    	if(CheckBCD1.isSelected() && CheckHex2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
				try {
					respuestaEntera    = Conversions.CBcdHexadecimalEntero(TextField1.getText().substring(0, point));
			// + "." + respuestaFraccion);
					//System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
					if(point < TextField1.getText().length())
						respuestaFraccion = Conversions.CBcdHexadecimalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
					TextField2.setText(respuestaEntera + "." + respuestaFraccion);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}	
    	}
    	
    	//Octal to Decimal
    	if(CheckDecimal1.isSelected() && CheckOct2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
				try {
					respuestaEntera    = Conversions.CDecimalOctalEntero(TextField1.getText().substring(0, point));
			// + "." + respuestaFraccion);
					//System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
					if(point < TextField1.getText().length())
						respuestaFraccion = Conversions.CDecimalOctalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
					TextField2.setText(respuestaEntera + "." + respuestaFraccion);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}	
    	}
    	
    	if(CheckDecimal1.isSelected() && CheckDec2.isSelected()){
    		String numeroaconvertir=TextField1.getText() ;
			for(int i = 0; i < numeroaconvertir.length(); i++)
    			if(numeroaconvertir.charAt(i) - '0' > 9)
    				JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
			TextField2.setText(numeroaconvertir);
    			
    	}
    	//BCD to Octal
    	if(CheckBCD1.isSelected() && CheckOct2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
				try {
					respuestaEntera    = Conversions.CBcdOctalEntero(TextField1.getText().substring(0, point));
			// + "." + respuestaFraccion);
					//System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
					if(point < TextField1.getText().length())
						respuestaFraccion = Conversions.CBcdOctalFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
					TextField2.setText(respuestaEntera + "." + respuestaFraccion);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}	
    	}
    	
    	if(CheckBCD1.isSelected() && CheckBCD2.isSelected()){
    		int point=TextField1.getText().length() ;
    		String respuestaEntera;
    		String respuestaFraccion = "";
    		for(int i =0; i < TextField1.getText().length(); i++){
    			if(TextField1.getText().charAt(i) == '.'){
    				point=i;
    				break;
    			}
    		}
				try {
					respuestaEntera    = Conversions.CBcdBcdEntero(TextField1.getText().substring(0, point));
			// + "." + respuestaFraccion);
					//System.out.println(TextField1.getText().substring(point, TextField1.getText().length()));
					if(point < TextField1.getText().length())
						respuestaFraccion = Conversions.CBcdBcdFraccion(TextField1.getText().substring(point + 1, TextField1.getText().length()));
					TextField2.setText(respuestaEntera + "." + respuestaFraccion);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(this,"Numero incorrecto, porfavor vuelva a insertar el numero");
				}	
    	}
    	
    	
    }


    private void CheckDec2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckDec2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckDec2StateChanged

    private void CheckDecimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDecimal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckDecimal1ActionPerformed

    private void CheckBin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBin1ActionPerformed

    private void CheckHex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckHex2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckHex2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
           
           
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConvertir;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JCheckBox CheckBCD1;
    private javax.swing.JCheckBox CheckBCD2;
    private javax.swing.JCheckBox CheckBin1;
    private javax.swing.JCheckBox CheckBin2;
    public static javax.swing.JCheckBox CheckDec2;
    public static javax.swing.JCheckBox CheckDecimal1;
    private javax.swing.JCheckBox CheckHex1;
    private javax.swing.JCheckBox CheckHex2;
    private javax.swing.JCheckBox CheckOct1;
    private javax.swing.JCheckBox CheckOct2;
    private javax.swing.ButtonGroup Group1;
    private javax.swing.ButtonGroup Group2;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
