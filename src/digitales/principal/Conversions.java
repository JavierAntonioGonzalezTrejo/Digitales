package digitales.principal;

import javax.swing.JOptionPane;

public final class Conversions {

	private static short binary=2;
	private static short octa=8;
	private static short hexa=16;
	private static char[]Hexadecimal={'0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?'};
	private static char[]CHexa=      {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
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
		for(int j = 0; j < 30 ; j++){ 
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
	
	
}
