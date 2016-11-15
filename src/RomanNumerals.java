import java.util.TreeMap;

public class RomanNumerals {
	
	private TreeMap<Character,Integer> mapping;
	
	public RomanNumerals(){
		mapping=new TreeMap<Character,Integer>();
		
		mapping.put('I', 1);
		mapping.put('V', 5);
		mapping.put('X', 10);
		mapping.put('L', 50);
		mapping.put('C', 100);
		mapping.put('D', 500);
		mapping.put('M', 1000);
	}
	
	/**
	 * Metodo che effettua i controlli sulla stringa e effettua la trasformazione
	 * @param romanNum
	 * @return
	 * @throws RowException
	 * @throws VLDrepeatedException 
	 * @throws IXCsubException 
	 * @throws VLDsubException 
	 * @throws moreOneSubException 
	 */
	public int convertToInteger(String romanNum) throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		if(stringContainRow(romanNum)){
			throw new RowException();
		}
		
		if(stringVLDrepeated(romanNum)){
			throw new VLDrepeatedException();
		}
		
		if(stringIXCsubs(romanNum)){
			throw new IXCsubException();
		}
		
		if(moreOneSub(romanNum)){
			throw new moreOneSubException();
			
		}
		
		if(stringVLDneverSub(romanNum)){
			throw new VLDsubException();
		}
		
		return converter(romanNum);
	}

	public boolean moreOneSub(String romanNum) {
		for(int i=romanNum.length()-1;i>1;i--){
			if(mapping.get(romanNum.charAt(i-1))<mapping.get(romanNum.charAt(i))){
				if(romanNum.charAt(i-2)==romanNum.charAt(i-1)){
					return true;
				}
			}
			
		}
		
		return false;
		
	}

	/**
	 * Verifica che V,L,D non siano mai sottratti
	 * @param romanNum
	 * @return
	 */
	public boolean stringVLDneverSub(String romanNum) {
		for(int i=0;i<romanNum.length()-1;i++){
			switch(romanNum.charAt(i)){
			case 'V':
				if(mapping.get('V')<mapping.get(romanNum.charAt(i+1))){
					return true;
				}
				break;
			
			case 'L':
				if(mapping.get('L')<mapping.get(romanNum.charAt(i+1))){
					return true;
				}
				break;
				
			case 'D':
				if(mapping.get('D')<mapping.get(romanNum.charAt(i+1))){
					return true;
				}
				break;
				
			default:
				break;
			}
		}
		
		return false;
		
	}

	/**
	 * Metodo che controlla che I,X,C vengano sottratte solo da i due valori superiori
	 * @param romanNum
	 * @return
	 */
	public boolean stringIXCsubs(String romanNum) {
		for(int i=0;i<romanNum.length()-1;i++){
			switch(romanNum.charAt(i)){
				case 'I':
					if(mapping.get('I')<mapping.get(romanNum.charAt(i+1))){
						if(!(romanNum.charAt(i+1)=='V')&&!(romanNum.charAt(i+1)=='X')){
							return true;
						}
					}
					break;
				
				case 'X':
					if(mapping.get('X')<mapping.get(romanNum.charAt(i+1))){
						if(!(romanNum.charAt(i+1)=='L')&&!(romanNum.charAt(i+1)=='C')){
							return true;
						}
					}
					break;
					
				case 'C':
					if(mapping.get('C')<mapping.get(romanNum.charAt(i+1))){
						if(!(romanNum.charAt(i+1)=='D')&&!(romanNum.charAt(i+1)=='M')){
							return true;
						}
					}
					break;
					
				default:
					break;
			}
		}
		
		return false;
		
	}

	/**
	 * verifica che V,L,D non siano mai ripetute
	 * @param romanNum
	 * @return
	 */
	public boolean stringVLDrepeated(String romanNum) {
		if(romanNum.length()==1){
			return false;
		}
		else{
			for(int i=0;i<romanNum.length()-1;i++){
				if(romanNum.charAt(i)==romanNum.charAt(i+1)&&((romanNum.charAt(i)=='V')||(romanNum.charAt(i)=='L')||(romanNum.charAt(i)=='D'))){
					return true;
				}
			}
			return false;
		}
		
	}

	/**
	 * Metodo che effettua la trasformazione
	 * @param romanNum
	 * @return il numero
	 */
	public int converter(String romanNum) {
		int tot=mapping.get(romanNum.charAt(romanNum.length()-1));
		
		for(int i=romanNum.length()-2; i>=0;i--){
			if(mapping.get(romanNum.charAt(i))<mapping.get(romanNum.charAt(i+1))){
				tot=tot-mapping.get(romanNum.charAt(i));
			}
			else{
				tot=tot+mapping.get(romanNum.charAt(i));
			}
			
		}
		
		return tot;
		
	}

	/**
	 * Controlla che I, X, C, M siano ripetute massimo tre volte di fila
	 * @param romanNum
	 * @return
	 */
	public boolean stringContainRow(String romanNum) {
		int conta_i=0,conta_x=0,conta_c=0,conta_m=0;
		
		switch(romanNum.charAt(0)){
		case 'I':
			conta_i=conta_i+1;
			break;
			
		case 'X':
			conta_x=conta_x+1;
			break;
			
		case 'C':
			conta_c=conta_c+1;
			break;
			
		case 'M':
			conta_m=conta_m+1;
			break;
		
		default:
			break;
		}
		
		for(int i=1;i<romanNum.length();i++){
			if(romanNum.charAt(i)==romanNum.charAt(i-1)){
				switch(romanNum.charAt(i)){
				case 'I':
					conta_i=conta_i+1;
					break;
					
				case 'X':
					conta_x=conta_x+1;
					break;
					
				case 'C':
					conta_c=conta_c+1;
					break;
					
				case 'M':
					conta_m=conta_m+1;
					break;
				
				default:
					conta_i=0;
					conta_x=0;
					conta_c=0;
					conta_m=0;
					break;
				}
			}
			else{
				conta_i=0;conta_x=0;conta_c=0;conta_m=0;
				switch(romanNum.charAt(i)){
				case 'I':
					conta_i=conta_i+1;
					break;
					
				case 'X':
					conta_x=conta_x+1;
					break;
					
				case 'C':
					conta_c=conta_c+1;
					break;
					
				case 'M':
					conta_m=conta_m+1;
					break;
					
				default:
					break;
				}
				
				
			}
			if(conta_i==4||conta_x==4||conta_c==4||conta_m==4){
				return true;
			}
		}
		
		return false;
	}
}
