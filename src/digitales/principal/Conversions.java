package digitales.principal;

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
}
