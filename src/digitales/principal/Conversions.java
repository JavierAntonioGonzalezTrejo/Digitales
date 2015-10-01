package digitales.principal;

import javax.swing.JOptionPane;

public final class Conversions {

	private static short binary=2;
	private static short octa=8;
	private static short hexa=16;
	private static char[]Octal={'0','1','2','3','4','5','6','7'};
	private static char[]Hexadecimal={'0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?'};
	private static char[]CHexa=      {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};


public static String CDecimalOctalEntero(String numeroaconvertir) throws Exception{
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 9)
				throw new Exception();
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

public static String CDecimalOctalFraccion(String numeroaconvertir) throws Exception{
	for(int i = 0; i < numeroaconvertir.length(); i++)
		if(numeroaconvertir.charAt(i) - '0' > 7)
			throw new Exception();
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
			if(numeroEvaluar >= 10){
				residuoUnitario= numeroEvaluar/10;
				numeroEvaluar-= residuoUnitario*10;
			}
			resultadosDivisiones.append(""+ numeroEvaluar);
		}
		buffer = new StringBuffer(resultadosDivisiones); 
		resultadosDivisiones =  new StringBuffer();
		System.out.println(buffer.toString());
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
	

	
	
////////////////////////////////////////////////////////////////////
/////Decimal Conversions
////////////////////////////////////////////////////////////////////
	public static String CDecimalHexadecimalEntero(String numeroaconvertir) throws Exception{
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 9)
				throw new Exception();
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
	
	public static String CDecimalHexadecimalFraccion(String numeroaconvertir) throws Exception{
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 9)
				throw new Exception();
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
				if(numeroEvaluar >= 10){
					residuoUnitario= numeroEvaluar/10;
					numeroEvaluar-= residuoUnitario*10;
				}
				resultadosDivisiones.append(""+ numeroEvaluar);
			}
			buffer = new StringBuffer(resultadosDivisiones); 
			resultadosDivisiones =  new StringBuffer();
			System.out.println(buffer.toString());
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
	

	//BINARIO A DECIMAL
	public static String CBinarioDecimalEntero(String numeroaconvertir) throws Exception
	{
		for(int i=0; i<numeroaconvertir.length(); i++)
		{
			if(numeroaconvertir.charAt(i) != '0' && numeroaconvertir.charAt(i) != '1')
			{
				System.out.println(numeroaconvertir.charAt(i));
				throw new Exception();
			}
		}
		
		String resultado;
		System.out.println(numeroaconvertir);
		int res=Integer.parseInt(numeroaconvertir,2);
		resultado = Integer.toString(res);			
		return resultado;
	}
	
	public static String CBinarioDecimalFraccion(String numeroaconvertir) throws Exception
	{
		for(int i=0; i<numeroaconvertir.length(); i++)
		{
			if(numeroaconvertir.charAt(i) !='0' && numeroaconvertir.charAt(i) != '1')
			{
				System.out.println(numeroaconvertir.charAt(i));
				throw new Exception();
			}
		}
		double resultado = 0;
		String resultadoFinal;
		int j=0;
		
		
		for(int i=0; i<numeroaconvertir.length();i++)
		{
			j++;
			resultado = resultado + (1 /Math.pow(2, j)*Integer.parseInt("" + numeroaconvertir.charAt(i)));		
		}
			
		resultadoFinal = Double.toString(resultado).substring(2, Double.toString(resultado).length());
		return resultadoFinal;
	}
	
	//BINARIO A OCTAL
	
	public static String CBinarioOctalEntero(String numeroaconvertir) throws Exception
	{
		int x = 0;
		int y = 2;
		String resultado = "";
		
		for(int i=0; i<numeroaconvertir.length(); i++)
		{
			if(numeroaconvertir.charAt(i) !='0' && numeroaconvertir.charAt(i) != '1')
			{
				throw new Exception();
			}
		}
		
		while(numeroaconvertir.length()%3 != 0)
		{
			numeroaconvertir = "0" + numeroaconvertir;
			System.out.println(numeroaconvertir);
		}
		
		for(int i=0; i<numeroaconvertir.length()/3; i++)
		{
			String cad = "";
			for(int j=x; j<=y; j++)
			{
				cad = cad + numeroaconvertir.charAt(j);
			}
			
			resultado = resultado + CBinarioDecimalEntero(cad);
		
			x = x+3;
			y = y+3;
			System.out.println(resultado);
		}
		
		// QUITAR CEROS
		
		System.out.println(resultado);
		return resultado;
	}
	
	public static String CBinarioOctalFraccion(String numeroaconvertir) throws Exception
	{
		int x = 0;
		int y = 2;
		String resultado = "";
		
		for(int i=0; i<numeroaconvertir.length(); i++)
		{
			if(numeroaconvertir.charAt(i) !='0' && numeroaconvertir.charAt(i) != '1')
			{
				throw new Exception();
			}
		}
		
		while(numeroaconvertir.length()%3 != 0)
		{
			numeroaconvertir = numeroaconvertir + '0';
			System.out.println(numeroaconvertir);
		}
		
		for(int i=0; i<numeroaconvertir.length()/3; i++)
		{
			String cad = "";
			for(int j=x; j<=y; j++)
			{
				cad = cad + numeroaconvertir.charAt(j);
			}
			resultado = resultado + CBinarioDecimalEntero(cad);
			x = x+3;
			y = y+3;
			System.out.println(resultado);
		}
		return resultado;
	}
	
	//BINARIO A HEXA
	public static String CBinarioHexaEntero(String numeroaconvertir) throws Exception
	{
		int x = 0;
		int y = 3;
		String resultado = "";
		String binDec = "";
		
		for(int i=0; i<numeroaconvertir.length(); i++)
		{
			if(numeroaconvertir.charAt(i) !='0' && numeroaconvertir.charAt(i) != '1')
			{
				throw new Exception();
			}
		}
		
		while(numeroaconvertir.length()%4 != 0)
		{
			numeroaconvertir = "0" + numeroaconvertir;
			System.out.println(numeroaconvertir);
		}
		
		for(int i=0; i<numeroaconvertir.length()/4; i++)
		{
			String cad = "";
			for(int j=x; j<=y; j++)
			{
				cad = cad + numeroaconvertir.charAt(j);
			}
			
			binDec = CBinarioDecimalEntero(cad);
			
			switch(binDec)
			{
			case "10":
				resultado = resultado + "A";
				break;
			
			case "11":
				resultado = resultado + "B";
				break;
				
			case "12":
				resultado = resultado + "C";
				break;
				
			case "13":
				resultado = resultado + "D";
				break;
				
			case "14":
				resultado = resultado + "E";
				break;
				
			case "15":
				resultado = resultado + "F";
				break;
			default:
				resultado = resultado + binDec;
				break;
			}	
			x = x+4;
			y = y+4;
			System.out.println(resultado);
		}
		
		// QUITAR CEROS
		
		return resultado;
	}
	
	public static String CBinarioHexaFraccion(String numeroaconvertir) throws Exception
	{
		int x = 0;
		int y = 3;
		String resultado = "";
		String binDec = "";
		
		for(int i=0; i<numeroaconvertir.length(); i++)
		{
			if(numeroaconvertir.charAt(i) !='0' && numeroaconvertir.charAt(i) != '1')
			{
				throw new Exception();
			}
		}
		
		while(numeroaconvertir.length()%4 != 0)
		{
			numeroaconvertir = numeroaconvertir + "0";
			System.out.println(numeroaconvertir);
		}
		
		for(int i=0; i<numeroaconvertir.length()/4; i++)
		{
			String cad = "";
			for(int j=x; j<=y; j++)
			{
				cad = cad + numeroaconvertir.charAt(j);
			}
			binDec = CBinarioDecimalEntero(cad);
		
			switch(binDec)
			{
			case "10":
				resultado = resultado + "A";
				break;
			
			case "11":
				resultado = resultado + "B";
				break;
				
			case "12":
				resultado = resultado + "C";
				break;
				
			case "13":
				resultado = resultado + "D";
				break;
				
			case "14":
				resultado = resultado + "E";
				break;
				
			case "15":
				resultado = resultado + "F";
				break;
			default:
				resultado = resultado + binDec;
				break;
			}	
			x = x+4;
			y = y+4;
	
			System.out.println(resultado);
		}
		return resultado;
	}
	
	

	
	public static String CDecimalBinarioEntero(String numeroaconvertir) throws Exception{
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 9)
				throw new Exception();
		StringBuffer resultadoPrevio = new StringBuffer(); //Esta variable contendra ala respuesta, pero esta estara al reves, de ahi su nombre.
		StringBuffer buffer= new StringBuffer (numeroaconvertir); //Contendra el numero resultado de las diviciones.
		StringBuffer resultadosDivisiones = new StringBuffer();//Sera modificada en cada iteracion, de esta se optendra el siguiente numero a dividir.
		int residuo=0;//Si a la divicion tiene residuo, aqui se guardara para sumarse en la siguiente iteracion
		int numeroEvaluar;//Aqui se guardara el numero extraido en ese momento para evaluarlo
		String resultado="0";
		while(!buffer.toString().equals("")){ //Cuando la cadena buffer sea "", se habra terminado la divicion
			for(int i = 0; i < buffer.length(); i++){ //Como la computadora tiene un limite, la divicion completa se subdividira en pequeñas subdiviciones por digito mas el residuo de la subdivicion anterior.
				numeroEvaluar= residuo*10 + buffer.charAt(i) - '0';//Se extree el digito en la posicion i, luego se le suma el residuo.
				if(numeroEvaluar/ binary == 0 &&  (i == 0 || i == 1) ){ //Si la subdivicion resulta 0 sin importar el residuo, ademas se encuantra en la posicion 0 o 1 (Al principio del numero), no se asigna nada a la variable resultadosDivisiones. Esto para evitar 0 a la izquierda
					residuo = numeroEvaluar;
				}
				else{
					resultadosDivisiones.append(Hexadecimal[(numeroEvaluar/ binary)] );//Se asigna el numero resultado de la subdivision a resultadosDiviciones
					residuo = numeroEvaluar % binary;	//Al residuo de la subdivision anteriormente realizada, se le guarda en esta variable, para una evaluacion posterior. 
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
	
	public static String CDecimalBinarioFraccion(String numeroaconvertir) throws Exception{
		System.out.println(numeroaconvertir);
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 9)
				throw new Exception();
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
				numeroEvaluar = numeroEvaluar*binary + residuoUnitario;
				if(numeroEvaluar >= 10){
					residuoUnitario= numeroEvaluar/10;
					numeroEvaluar-= residuoUnitario*10;
				}
				resultadosDivisiones.append(""+ numeroEvaluar);
			}
			buffer = new StringBuffer(resultadosDivisiones); 
			resultadosDivisiones =  new StringBuffer();
			System.out.println(buffer.toString());
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
	

	public static String CDecimalBCDEntero(String numeroaconvertir) throws Exception{
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 9)
				throw new Exception();
		StringBuffer resultado = new StringBuffer();
		StringBuffer numero = new StringBuffer(numeroaconvertir);
		numero.reverse();
		
		for(int i = 0; i <  numero.length(); i++){
			switch(numero.charAt(i)){
			case '0': resultado.append("0000");
				break;
			case '1': resultado.append("1000");
				break;
			case '2': resultado.append("0100");
				break;
			case '3': resultado.append("1100");
				break;
			case '4': resultado.append("0010");
				break;
			case '5': resultado.append("1010");
				break;
			case '6': resultado.append("0110");
				break;
			case '7': resultado.append("1110");
				break;
			case '8': resultado.append("0001");
				break;
			case '9': resultado.append("1001");
				break;
			}
			
		}
		
		resultado.reverse();
		
		return resultado.toString();
		
	}

	public static String CDecimalBCDFraccion(String numeroaconvertir) throws Exception{
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 9)
				throw new Exception();
		
		StringBuffer resultado = new StringBuffer();
		StringBuffer numero = new StringBuffer(numeroaconvertir);
		
		for(int i = 0; i <  numero.length(); i++){
			switch(numero.charAt(i)){
			case '0': resultado.append("0000");
				break;
			case '1': resultado.append("0001");
				break;
			case '2': resultado.append("0010");
				break;
			case '3': resultado.append("0011");
				break;
			case '4': resultado.append("0100");
				break;
			case '5': resultado.append("0101");
				break;
			case '6': resultado.append("0110");
				break;
			case '7': resultado.append("0111");
				break;
			case '8': resultado.append("1000");
				break;
			case '9': resultado.append("1001");
				break;
			}
			
		}
		
		
		return resultado.toString();
	}
	
	///////////////////////////////////////////////////////////////////////
	/////Decimal CONVERSIONS ENDS
	///////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////
	/////Hexadecimal CONVERSIONS ENDS
	///////////////////////////////////////////////////////////////////////
	
	public static String CHexadecimalBinarioEntero(String numeroaconvertir) throws Exception{
		
		StringBuffer resultado = new StringBuffer();
		StringBuffer numero = new StringBuffer(numeroaconvertir);
		numero.reverse();
		
		for(int i = 0; i <  numero.length(); i++){
			switch(numero.charAt(i)){
			case '0': resultado.append("0000");
				break;
			case '1': resultado.append("1000");
				break;
			case '2': resultado.append("0100");
				break;
			case '3': resultado.append("1100");
				break;
			case '4': resultado.append("0010");
				break;
			case '5': resultado.append("1010");
				break;
			case '6': resultado.append("0110");
				break;
			case '7': resultado.append("1110");
				break;
			case '8': resultado.append("0001");
				break;
			case '9': resultado.append("1001");
				break;
			case 'A': resultado.append("0101");
				break;
			case 'B': resultado.append("1101");
				break;
			case 'C': resultado.append("0011");
				break;
			case 'D': resultado.append("1011");
				break;
			case 'E': resultado.append("0111");
				break;
			case 'F': resultado.append("1111");
				break;
			default: throw new Exception();
			}
			
		}
		
		resultado.reverse();
		
		return resultado.toString();
		
	}

	public static String CHexadecimalBinarioFraccion(String numeroaconvertir) throws Exception{
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 15)
				throw new Exception();
		
		StringBuffer resultado = new StringBuffer();
		StringBuffer numero = new StringBuffer(numeroaconvertir);
		
		for(int i = 0; i <  numero.length(); i++){
			switch(numero.charAt(i)){
			case '0': resultado.append("0000");
				break;
			case '1': resultado.append("0001");
				break;
			case '2': resultado.append("0010");
				break;
			case '3': resultado.append("0011");
				break;
			case '4': resultado.append("0100");
				break;
			case '5': resultado.append("0101");
				break;
			case '6': resultado.append("0110");
				break;
			case '7': resultado.append("0111");
				break;
			case '8': resultado.append("1000");
				break;
			case '9': resultado.append("1001");
				break;
			case 'A': resultado.append("1010");
				break;
			case 'B': resultado.append("1011");
				break;
			case 'C': resultado.append("1100");
				break;
			case 'D': resultado.append("1101");
				break;
			case 'E': resultado.append("1110");
				break;
			case 'F': resultado.append("1111");
			
			}
		}
		
		return resultado.toString();
			
	}
	
	///////////////////////////////////////////////////////////////////////
	/////Hexadecimal CONVERSIONS ENDS
	///////////////////////////////////////////////////////////////////////
	
	////////////////////////////////////////////////////////////////////
	/////BCD CONVERSIONS
	////////////////////////////////////////////////////////////////////
	public static String CBcdDecimalEntero(String numeroaconvertir) throws Exception{
		StringBuffer resultado = new StringBuffer();
		int i;
		StringBuffer numeroConvertir= new StringBuffer(numeroaconvertir);
		numeroConvertir = numeroConvertir.reverse();
		//System.out.println(numeroConvertir.length());
		for(i = 0; i + 4 < numeroConvertir.length(); i += 4){
			System.out.println(numeroConvertir.substring(i, i+4).toString());
			resultado.append(Conversions.BcdSingleBite(numeroConvertir.substring(i, i+4)).toString());
		}
		//System.out.println(numeroConvertir.substring(i, numeroConvertir.length()));
		resultado.append(Conversions.BcdSingleBite(numeroConvertir.substring(i, numeroConvertir.length())).toString());
		resultado.reverse();
		return resultado.toString();
	}
	
	
	public static String CBcdDecimalFraccion(String numeroaconvertir) throws Exception {
		StringBuffer resultado = new StringBuffer();
		int i;
		StringBuffer numeroConvertir= new StringBuffer(numeroaconvertir);
		numeroConvertir = numeroConvertir.reverse();
		//System.out.println(numeroConvertir.length());
		for(i = 0; i + 4 < numeroConvertir.length(); i += 4){
			System.out.println(numeroConvertir.substring(i, i+4).toString());
			resultado.append(Conversions.BcdSingleBite(numeroConvertir.substring(i, i+4)).toString());
		}
		//System.out.println(numeroConvertir.substring(i, numeroConvertir.length()));
		resultado.append(Conversions.BcdSingleBite(numeroConvertir.substring(i, numeroConvertir.length())).toString());
		resultado.reverse();
		return resultado.toString();
	}	
	
	private static  String BcdSingleBite(String bite) throws Exception{
		
		int entero=0;
		for(int i = 0; i < bite.length(); i++){
			if(bite.charAt(i) - '0' > 1)
				throw new Exception();
			//System.out.println("" + Math.pow(2, i));
			entero+= (int) ((bite.charAt(i) - '0')* Math.pow(2,i));
		}		
		if(entero > 9){
			throw new Exception();
		}
		return Integer.toString(entero);
	}
	
	public static String CBcdBinarioEntero(String numeroaconvertir) throws Exception{
		String binario = Conversions.CBcdDecimalEntero(numeroaconvertir);
		
		return Conversions.CDecimalBinarioEntero(binario);
	}
	
	
	public static String CBcdBinarioFraccion(String numeroaconvertir) throws Exception {
		String binario = Conversions.CBcdDecimalFraccion(numeroaconvertir);
		System.out.println(binario);
		return Conversions.CDecimalBinarioFraccion(binario);
	}	

	
	public static String CBcdOctalEntero(String numeroaconvertir) throws Exception{
		String decimal = Conversions.CBcdDecimalEntero(numeroaconvertir);
		
		return Conversions.CDecimalOctalEntero(decimal);
	}
	
	
	public static String CBcdOctalFraccion(String numeroaconvertir) throws Exception {
		String decimal = Conversions.CBcdDecimalFraccion(numeroaconvertir);
		
		return Conversions.CDecimalOctalFraccion(decimal);
	}
	
	public static String CBcdHexadecimalEntero(String numeroaconvertir) throws Exception{
		String decimal = Conversions.CBcdDecimalEntero(numeroaconvertir);
		
		return Conversions.CDecimalHexadecimalEntero(decimal);
	}
	
	
	public static String CBcdHexadecimalFraccion(String numeroaconvertir) throws Exception {
		String decimal = Conversions.CBcdDecimalFraccion(numeroaconvertir);
		
		return Conversions.CDecimalHexadecimalFraccion(decimal);
	}
	
	public static String CBcdBcdEntero(String numeroaconvertir) throws Exception{
		String decimal = Conversions.CBcdDecimalEntero(numeroaconvertir);
		
		return Conversions.CDecimalBCDEntero(decimal);
	}
	
	
	public static String CBcdBcdFraccion(String numeroaconvertir) throws Exception {
		String decimal = Conversions.CBcdDecimalFraccion(numeroaconvertir);
		
		return Conversions.CDecimalBCDFraccion(decimal);
	}

	
	///////////////////////////////////////////////////////////////////////
	/////BCD CONVERSIONS ENDS
	///////////////////////////////////////////////////////////////////////
	
}	


