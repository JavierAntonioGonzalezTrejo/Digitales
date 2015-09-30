package digitales.principal;

import javax.swing.JOptionPane;

public final class Conversions {

	private static short binary=2;
	private static short octa=8;
	private static short hexa=16;
	private static char[]Octal={'0','1','2','3','4','5','6','7'};
	private static char[]Hexadecimal={'0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?'};
	private static char[]CHexa=      {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};


public static String CDecimalOctalEntero(String numeroaconvertir){
		StringBuffer resultadoPrevio = new StringBuffer();
		StringBuffer buffer = new StringBuffer(numeroaconvertir);
		StringBuffer resultadosDivsiones = new StringBuffer();
		int residuo = 0;
		int numeroEvaluar;
		String resultado ="0";
		while(!buffer.toString().equals("")){
			for(int i=0;i<buffer.length();i++){
				numeroEvaluar = residuo*10 + buffer.charAt(i) - '0';
				if(numeroEvaluar/octa == 0 && (i==0 || i==1)){
					residuo = numeroEvaluar;
				}
				else{
					resultadosDivsiones.append(Octal[(numeroEvaluar/octa)]);
					residuo = numeroEvaluar % octa;
				}
			}
			buffer = new StringBuffer(resultadosDivsiones);
			resultadosDivsiones = new StringBuffer();
			resultadoPrevio.append(Octal[residuo]);
			residuo = 0;
		}
		buffer = resultadoPrevio;
		resultadoPrevio = new StringBuffer();
		for(int i =0; i < buffer.length();i++){
			resultadoPrevio.append(Octal[(buffer.charAt(i)-'0')]);
		}
		resultado = resultadoPrevio.reverse().toString();
		return resultado;
	}	
		
public static String COctalBinarioEntero(String numeroaconvertir){
	int num;
	int cont = 0;
	String temp;
	String salida;
	for(int i=0;i<numeroaconvertir.length();i++)
	{
		temp = numeroaconvertir.charAt(i) + "";
		if(Integer.parseInt(temp) > 7 ){
			cont = 0;
			break;
		}
		cont=1;
	}
	
	if (cont == 0)
		salida = "Error";
	else	{
	num = Integer.parseInt(numeroaconvertir,8);
	salida = Integer.toBinaryString(num);
	}
	return salida;
}	

public static String COctalDecimalEntero(String numeroaconvertir){
	
	String temp;
	String decimal;
	int cont = 1;
	for(int i=0;i<numeroaconvertir.length();i++)
	{
		temp = numeroaconvertir.charAt(i) + "";
		if(Integer.parseInt(temp) > 7){
			cont = 0;
			break;
		}
		cont=1;
	}
	
	if (cont == 0)
		decimal = "Error";
	else
	{
	int num = Integer.parseInt(numeroaconvertir,8);
	num = Integer.parseInt(numeroaconvertir,8);
	decimal = Integer.toString(num);
	}	
	return decimal;
}

public static String COctalDecimalFraccion(String numeroaconvertir){
	double resultado =0.0;
	String salida;
	int cont = 1;
	String temp;
	int j=0;
		for(int i=0;i<numeroaconvertir.length() ;i++)
		{
			temp = numeroaconvertir.charAt(i) + "";
			if(Integer.parseInt(temp) > 7 ){
				cont = 0;
				break;
			}
			cont=1;
		}
		
		if (cont == 0)
			salida = "  Error";
		else
		{
		for(int i=0; i<numeroaconvertir.length();i++)
		{
			j++;
			resultado = resultado + (1 /Math.pow(8, j)*Integer.parseInt("" + numeroaconvertir.charAt(i)));
		}
		salida = resultado + "";
		}
		return salida.substring(2, salida.length());
}

public static String COctalBinarioFraccion(String numeroaconvertir){
	String resultado = "";
	for(int K = 0; K < numeroaconvertir.length();K++)
	{
		if(numeroaconvertir.charAt(K) == '0')
			resultado += "000";
		else if(numeroaconvertir.charAt(K) == '1')
			resultado += "001";
		else if(numeroaconvertir.charAt(K) == '2')
			resultado += "010";
		else if(numeroaconvertir.charAt(K) == '3')
			resultado += "011";
		else if(numeroaconvertir.charAt(K) == '4')
			resultado += "100";
		else if(numeroaconvertir.charAt(K) == '5')
			resultado += "101";
		else if(numeroaconvertir.charAt(K) == '6')
			resultado += "110";
		else if(numeroaconvertir.charAt(K) == '7')
			resultado += "111";
		else 
		{
			resultado = "Error";
			break;
		}
	}
	return resultado;	
}
	
	public static String CDecimalHexadecimalEntero(String numeroaconvertir){
		StringBuffer resultadoPrevio = new StringBuffer(); //Esta variable contendra ala respuesta, pero esta estara al reves, de ahi su nombre.
		StringBuffer buffer= new StringBuffer (numeroaconvertir); //Contendra el numero resultado de las diviciones.
		StringBuffer resultadosDivisiones = new StringBuffer();//Sera modificada en cada iteracion, de esta se optendra el siguiente numero a dividir.
		int residuo=0;//Si a la divicion tiene residuo, aqui se guardara para sumarse en la siguiente iteracion
		int numeroEvaluar;//Aqui se guardara el numero extraido en ese momento para evaluarlo
		String resultado="0";
		while(!buffer.toString().equals("")){ //Cuando la cadena buffer sea "", se habra terminado la divicion
			for(int i = 0; i < buffer.length(); i++){ //Como la computadora tiene un limite, la divicion completa se subdividira en pequeñas subdiviciones por digito mas el residuo de la subdivicion anterior.
				numeroEvaluar= residuo*10 + buffer.charAt(i) - '0';//Se extree el digito en la posicion i, luego se le suma el residuo.
				if(numeroEvaluar/ hexa == 0 &&  (i == 0 || i == 1) ){ //Si la subdivicion resulta 0 sin importar el residuo, ademas se encuantra en la posicion 0 o 1 (Al principio del numero), no se asigna nada a la variable resultadosDivisiones. Esto para evitar 0 a la izquierda
					residuo = numeroEvaluar;
				}
				else{
					resultadosDivisiones.append(Hexadecimal[(numeroEvaluar/ hexa)] );//Se asigna el numero resultado de la subdivision a resultadosDiviciones
					residuo = numeroEvaluar % hexa;	//Al residuo de la subdivision anteriormente realizada, se le guarda en esta variable, para una evaluacion posterior. 
				}
				
				
			}
			
			buffer = new StringBuffer(resultadosDivisiones); //Se guarda el resultado de la division completa en la variable buffer, para que contenga el nuevo numero a dividir
			resultadosDivisiones =  new StringBuffer();
			resultadoPrevio.append(Hexadecimal[residuo]);//Como se quiere obtener el residuo de cada divicion completa, el sobrante total se obtiene al completar el todas las subdiviciones sobre el buffer. Este se guarda en esta variable junto a los residuos posteriores.
			residuo = 0;
		}
		buffer = resultadoPrevio;
		resultadoPrevio = new StringBuffer();
		for(int i =0; i < buffer.length();i++){
			resultadoPrevio.append(CHexa[buffer.charAt(i)-'0']);
		}
		resultado = resultadoPrevio.reverse().toString(); //Se voltea el resultado previo ya que el numero mas significativo se encuantra en un principio a la derecha, cuando esto no debe de ser.
		return resultado;
	}
	
	public static String CDecimalHexadecimalFraccion(String numeroaconvertir){
		StringBuffer resultadoPrevio = new StringBuffer(); 
		StringBuffer buffer= new StringBuffer (numeroaconvertir);
		buffer.reverse();
		StringBuffer resultadosDivisiones = new StringBuffer();
		int residuoUnitario=0;
		int numeroEvaluar;
		String resultado="0";
		for(int j = 0; j < 10 ; j++){ 
			for(int i = 0; i < buffer.length(); i++){ 
				numeroEvaluar= buffer.charAt(i) - '0';
				numeroEvaluar = numeroEvaluar*hexa + residuoUnitario;
				if(numeroEvaluar > 10){
					residuoUnitario= numeroEvaluar/10;
					numeroEvaluar-= residuoUnitario*10;
				}
				resultadosDivisiones.append(""+ numeroEvaluar);
			}
			buffer = new StringBuffer(resultadosDivisiones); 
			resultadosDivisiones =  new StringBuffer();
			resultadoPrevio.append(Hexadecimal[residuoUnitario]);
			residuoUnitario = 0;
		}
		buffer = resultadoPrevio;
		resultadoPrevio = new StringBuffer();
		for(int i =0; i < buffer.length();i++){
			resultadoPrevio.append(CHexa[buffer.charAt(i)-'0']);
		}
		resultado= resultadoPrevio.toString();
		return resultado;
	}
}
