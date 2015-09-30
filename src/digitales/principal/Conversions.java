package digitales.principal;

public final class Conversions {

	private static short binary=2;
	private static short octa=8;
	private static short hexa=16;
	private static char[]Hexadecimal={'0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?'};
	private static char[]CHexa=      {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	
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
		for(int i = 0; i < numeroaconvertir.length(); i++)
			if(numeroaconvertir.charAt(i) - '0' > 15)
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

	
	public static String CBcdHexadecimalEntero(String numeroaconvertir) throws Exception{
		String decimal = Conversions.CBcdDecimalEntero(numeroaconvertir);
		
		return Conversions.CDecimalHexadecimalEntero(decimal);
	}
	
	
	public static String CBcdHexadecimalFraccion(String numeroaconvertir) throws Exception {
		String decimal = Conversions.CBcdDecimalFraccion(numeroaconvertir);
		
		return Conversions.CDecimalHexadecimalFraccion(decimal);
	}
	
	

	
	///////////////////////////////////////////////////////////////////////
	/////BCD CONVERSIONS ENDS
	///////////////////////////////////////////////////////////////////////
	

}
