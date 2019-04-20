package eg.edu.alexu.csd.datastructure.linkedList;

public class ans implements IPolynomialSolver {
	public static ILinkedList head_A= new singlyLinkedList();
	public static ILinkedList head_B= new singlyLinkedList();
	public static ILinkedList head_C= new singlyLinkedList();
	public static ILinkedList R= new singlyLinkedList();
	public int colNum=0;
	@Override
	public void setPolynomial(char poly, int[][] terms) {
		// TODO Auto-generated method stub
		if(poly == 'A') {
				for(int i=0;i< colNum;i++) {
					for(int j=0;j<2;j++) {
						head_A.add(terms[j][i]);
					}
				}
		}else if(poly == 'B') {
			for(int i=0;i< colNum;i++) {
				for(int j=0;j<2;j++) {
					head_B.add(terms[j][i]);
				}
			}
		}else if(poly == 'C') {
			for(int i=0;i< colNum;i++) {
				for(int j=0;j<2;j++) {
					head_C.add(terms[j][i]);
				}
			}
		}
		return;
	}

	@Override
	public String print(char poly) {
		// TODO Auto-generated method stub
		if(poly == 'A') {
			String res = "";
			int i=0;
			while(head_A.get(i) != null) {
				if(i%2 != 0) {
					int q = (int) head_A.get(i-1);
					int z = (int) head_A.get(i);
					if(q==0) {
						
					}else if(z!=0 && z!=1) {
						res = res + "X^" + head_A.get(i).toString();
					}else if(z==1) {
						res = res + 'x';
					}else if(z==0) {
						
					}
				}else {
					int q = (int) head_A.get(i);
					if((q==0)||(q == 1 && i!=head_A.size()-2)) {
						
					}else if(q == -1 && i+1<head_A.size() && (int)head_A.get(i+1)==1) {
						res = res + '-';
					}else {
						if(q<0) {
							res += head_A.get(i).toString();
						}else {
							if(i==0) {
								res = res + head_A.get(i).toString();
							}else {
								res = res+ '+' + head_A.get(i).toString();
							}
							
						}
					}
				}

				i++;
			}
			return res;
		}else if(poly == 'B') {
			String res = "";
			int i=0;
			while(head_B.get(i) != null) {
				if(i%2 != 0) {
					int q = (int) head_B.get(i-1);
					int z = (int) head_B.get(i);
					if(q==0) {
						
					}else if(z!=0 && z!=1) {
						res = res + "X^" + head_B.get(i).toString();
					}else if(z==1) {
						res = res + 'x';
					}else if(z==0) {
						
					}
				}else {
					int q = (int) head_B.get(i);
					if((q==0)||(q == 1 && i!=head_B.size()-2)) {
						
					}else if(q == -1 && i+1<head_B.size() && (int)head_B.get(i+1)==1) {
						res = res + '-';
					}else {
						if(q<0) {
							res += head_B.get(i).toString();
						}else {
							if(i==0) {
								res = res + head_B.get(i).toString();
							}else {
								res = res+ '+' + head_B.get(i).toString();
							}
							
						}
					}
				}

				i++;
			}
			return res;
		}else if(poly == 'C') {
			String res = "";
			int i=0;
			while(head_C.get(i) != null) {
				if(i%2 != 0) {
					int q = (int) head_C.get(i-1);
					int z = (int) head_C.get(i);
					if(q==0) {
						
					}else if(z!=0 && z!=1) {
						res = res + "X^" + head_C.get(i).toString();
					}else if(z==1) {
						res = res + 'x';
					}else if(z==0) {
						
					}
				}else {
					int q = (int) head_C.get(i);
					if((q==0)||(q == 1 && i!=head_C.size()-2)) {
						
					}else if(q == -1 && i+1<head_C.size() && (int)head_C.get(i+1)==1) {
						res = res + '-';
					}else {
						if(q<0) {
							res += head_C.get(i).toString();
						}else {
							if(i==0) {
								res = res + head_C.get(i).toString();
							}else {
								res = res+ '+' + head_C.get(i).toString();
							}
							
						}
					}
				}

				i++;
			}
			return res;
		}else if(poly == 'R') {
			String res = "";
			int i=0;
			while(R.get(i) != null) {
				if(i%2 != 0) {
					int q = (int) R.get(i-1);
					int z = (int) R.get(i);
					if(q==0) {
						
					}else if(z!=0 && z!=1) {
						res = res + "X^" + R.get(i).toString();
					}else if(z==1) {
						res = res + 'x';
					}else if(z==0) {
						
					}
				}else {
					int q = (int) R.get(i);
					if((q==0)||(q == 1 && i!=R.size()-2)) {
						
					}else if(q == -1 && i+1<R.size() && (int)R.get(i+1)==1) {
						res = res + '-';
					}else {
						if(q<0) {
							res += R.get(i).toString();
						}else {
							if(i==0) {
								res = res + R.get(i).toString();
							}else {
								res = res+ '+' + R.get(i).toString();
							}
							
						}
					}
				}

				i++;
			}
			return res;
		}
		return null;
	}

	@Override
	public void clearPolynomial(char poly) {
		// TODO Auto-generated method stub
		if(poly == 'A') {
			head_A.clear();
			head_A = new singlyLinkedList();
		}
		if(poly == 'B') {
			head_B.clear();
			head_B = new singlyLinkedList();
		}
		if(poly == 'C') {
			head_C.clear();
			head_C = new singlyLinkedList();
		}
		if(poly == 'R') {
			R.clear();
			R = new singlyLinkedList();
		}
		return;
	}

	@Override
	public float evaluatePolynomial(char poly, float value) {
		// TODO Auto-generated method stub
		float sum=0;
		int i=1;
		if(poly == 'A') {
			while(i<head_A.size()) {
				int x = (int)head_A.get(i-1);
				int y =(int)head_A.get(i);
				float coff = (float)x;
				float exp = (float)y;
				sum = (float) (sum + (coff * (Math.pow(value, exp))));
				i+=2;
			}
			return sum;
		}else if(poly == 'B') {
			while(i<head_B.size()) {
				int x = (int)head_B.get(i-1);
				int y =(int)head_B.get(i);
				float coff = (float)x;
				float exp = (float)y;
				sum = (float) (sum + (coff * (Math.pow(value, exp))));
				i+=2;
			}
			return sum;
		}else if(poly == 'C') {
			while(i<head_C.size()) {
				int x = (int)head_C.get(i-1);
				int y =(int)head_C.get(i);
				float coff = (float)x;
				float exp = (float)y;
				sum = (float) (sum + (coff * (Math.pow(value, exp))));
				i+=2;
			}
			return sum;
		}else if(poly == 'R') {
			while(i<R.size()) {
				int x = (int)R.get(i-1);
				int y =(int)R.get(i);
				float coff = (float)x;
				float exp = (float)y;
				sum = (float) (sum + (coff * (Math.pow(value, exp))));
				i+=2;
			}
			return sum;
		}
		return 0;
	}

	@Override
	public int[][] add(char poly1, char poly2) {
		// TODO Auto-generated method stub
		if((poly1=='A'&&poly2=='B')||(poly2=='A'&&poly1=='B')) {
			int i=1,j=1;
			while(j<head_A.size()&&i<head_B.size()) {
				if(head_A.get(j) == head_B.get(i)) {
					int coff= (int)head_A.get(j-1)+(int)head_B.get(i-1);
					int exp = (int)head_A.get(j);
					R.add(coff);
					R.add(exp);
					i+=2;
					j+=2;
				}else {
					if((int)head_A.get(j) > (int)head_B.get(i)) {
						R.add(head_A.get(j-1));
						R.add(head_A.get(j));
						j+=2;
					}else if((int)head_A.get(j) < (int)head_B.get(i)) {
						R.add(head_B.get(i-1));
						R.add(head_B.get(i));
						i+=2;
					}
				}
			}
			while(i<head_B.size()) {
				R.add(i-1);
				R.add(i);
				i+=2;
			}
			while(j<head_A.size()) {
				R.add(j-1);
				R.add(j);
				j+=2;
			}
			return getArray(R);
		}else if((poly1=='A'&&poly2=='C')||(poly2=='A'&&poly1=='C')) {
			int i=1,j=1;
			while(j<head_A.size()&&i<head_C.size()) {
				if(head_A.get(j) == head_C.get(i)) {
					int coff= (int)head_A.get(j-1)+(int)head_C.get(i-1);
					int exp = (int)head_A.get(j);
					R.add(coff);
					R.add(exp);
					i+=2;
					j+=2;
				}else {
					if((int)head_A.get(j) > (int)head_C.get(i)) {
						R.add(head_A.get(j-1));
						R.add(head_A.get(j));
						j+=2;
					}else if((int)head_A.get(j) < (int)head_C.get(i)) {
						R.add(head_C.get(i-1));
						R.add(head_C.get(i));
						i+=2;
					}
				}
			}
			while(i<head_C.size()) {
				R.add(i-1);
				R.add(i);
				i+=2;
			}
			while(j<head_A.size()) {
				R.add(j-1);
				R.add(j);
				j+=2;
			}
			return getArray(R);
		}else if((poly1=='B'&&poly2=='C')||(poly2=='B'&&poly1=='C')) {
			int i=1,j=1;
			while(j<head_C.size()&&i<head_B.size()) {
				if(head_C.get(j) == head_B.get(i)) {
					int coff= (int)head_C.get(j-1)+(int)head_B.get(i-1);
					int exp = (int)head_C.get(j);
					R.add(coff);
					R.add(exp);
					i+=2;
					j+=2;
				}else {
					if((int)head_C.get(j) > (int)head_B.get(i)) {
						R.add(head_C.get(j-1));
						R.add(head_C.get(j));
						j+=2;
					}else if((int)head_C.get(j) < (int)head_B.get(i)) {
						R.add(head_B.get(i-1));
						R.add(head_B.get(i));
						i+=2;
					}
				}
			}
			while(i<head_B.size()) {
				R.add(i-1);
				R.add(i);
				i+=2;
			}
			while(j<head_C.size()) {
				R.add(j-1);
				R.add(j);
				j+=2;
			}
			return getArray(R);
		}
		return null;
	}
	
	public int[][] getArray(ILinkedList R){
		int[][] terms = new int[2][R.size()/2];
		int k=0;
		for(int i=0;i<(R.size()/2);i++) {
			for(int j=0;j<2;j++) {
				terms[j][i]=(int) R.get(k);
				k++;
			}
		}
		return terms;
	}
	
	@Override
	public int[][] subtract(char poly1, char poly2) {
		// TODO Auto-generated method stub
		if((poly1=='A'&&poly2=='B')||(poly2=='A'&&poly1=='B')) {
			int i=1,j=1;
			while(j<head_A.size()&&i<head_B.size()) {
				if(head_A.get(j) == head_B.get(i)) {
					int coff=0;
					if(poly1 == 'B') coff = (int)head_B.get(j-1)-(int)head_A.get(i-1);
					if(poly1 == 'A') coff = (int)head_A.get(j-1)-(int)head_B.get(i-1);
					int exp = (int)head_A.get(j);
					R.add(coff);
					R.add(exp);
					i+=2;
					j+=2;
				}else {
					if((int)head_A.get(j) > (int)head_B.get(i)) {
						R.add(head_A.get(j-1));
						R.add(head_A.get(j));
						j+=2;
					}else if((int)head_A.get(j) < (int)head_B.get(i)) {
						R.add(head_B.get(i-1));
						R.add(head_B.get(i));
						i+=2;
					}
				}
			}
			while(i<head_B.size()) {
				R.add(i-1);
				R.add(i);
				i+=2;
			}
			while(j<head_A.size()) {
				R.add(j-1);
				R.add(j);
				j+=2;
			}
			return getArray(R);
		}else if((poly1=='A'&&poly2=='C')||(poly2=='A'&&poly1=='C')) {
			int i=1,j=1;
			while(j<head_A.size()&&i<head_C.size()) {
				if(head_A.get(j) == head_C.get(i)) {
					int coff= (int)head_A.get(j-1)-(int)head_C.get(i-1);
					if(poly1=='C') coff= (int)head_C.get(j-1)-(int)head_A.get(i-1);
					int exp = (int)head_A.get(j);
					R.add(coff);
					R.add(exp);
					i+=2;
					j+=2;
				}else {
					if((int)head_A.get(j) > (int)head_C.get(i)) {
						R.add(head_A.get(j-1));
						R.add(head_A.get(j));
						j+=2;
					}else if((int)head_A.get(j) < (int)head_C.get(i)) {
						R.add(head_C.get(i-1));
						R.add(head_C.get(i));
						i+=2;
					}
				}
			}
			while(i<head_C.size()) {
				R.add(i-1);
				R.add(i);
				i+=2;
			}
			while(j<head_A.size()) {
				R.add(j-1);
				R.add(j);
				j+=2;
			}
			return getArray(R);
		}else if((poly1=='B'&&poly2=='C')||(poly2=='B'&&poly1=='C')) {
			int i=1,j=1;
			while(j<head_C.size()&&i<head_B.size()) {
				if(head_C.get(j) == head_B.get(i)) {
					int coff= (int)head_C.get(j-1)-(int)head_B.get(i-1);
					if(poly1=='B') coff= (int)head_B.get(j-1)-(int)head_C.get(i-1);
					int exp = (int)head_C.get(j);
					R.add(coff);
					R.add(exp);
					i+=2;
					j+=2;
				}else {
					if((int)head_C.get(j) > (int)head_B.get(i)) {
						R.add(head_C.get(j-1));
						R.add(head_C.get(j));
						j+=2;
					}else if((int)head_C.get(j) < (int)head_B.get(i)) {
						R.add(head_B.get(i-1));
						R.add(head_B.get(i));
						i+=2;
					}
				}
			}
			while(i<head_B.size()) {
				R.add(i-1);
				R.add(i);
				i+=2;
			}
			while(j<head_C.size()) {
				R.add(j-1);
				R.add(j);
				j+=2;
			}
			return getArray(R);
		}
		return null;
	}

	@Override
	public int[][] multiply(char poly1, char poly2) {
		// TODO Auto-generated method stub
		if((poly1=='A' && poly2=='B')||(poly2=='A' && poly1=='B')) {
			for(int j=1;j<head_A.size();j+=2) {
				for(int i=1;i<head_B.size();i+=2) {
					int exp = (int)head_A.get(j)+(int)head_B.get(i);
					int coff = (int)head_A.get(j-1)*(int)head_B.get(i-1);
					R.add(coff);
					R.add(exp);
				}
			}
			for(int j=1;j<R.size();j+=2) {
				for(int k =j+2;k<R.size();k+=2) {
					if(R.get(j) == R.get(k)) {
						int res = (int)R.get(j-1)+(int)R.get(k-1);
						R.set(j-1, res);
						R.remove(j);
						R.remove(k-1);
						R.remove(k-2);
						if(res == 0) {
							R.remove(j-1);
						}
						k=j;
					}
				}
			}
			return getArray(R);
		}else if((poly1=='A' && poly2=='C')||(poly2=='A' && poly1=='C')) {
			for(int j=1;j<head_A.size();j+=2) {
				for(int i=1;i<head_C.size();i+=2) {
					int exp = (int)head_A.get(j)+(int)head_C.get(i);
					int coff = (int)head_A.get(j-1)*(int)head_C.get(i-1);
					R.add(coff);
					R.add(exp);
				}
			}
			for(int j=1;j<R.size();j+=2) {
				for(int k =j+2;k<R.size();k+=2) {
					if(R.get(j) == R.get(k)) {
						int res = (int)R.get(j-1)+(int)R.get(k-1);
						R.set(j-1, res);
						R.remove(j);
						R.remove(k-1);
						R.remove(k-2);
						if(res == 0) {
							R.remove(j-1);
						}
						k=j;
					}
				}
			}
			return getArray(R);
		}else if((poly1=='B' && poly2=='C')||(poly2=='B' && poly1=='C')) {
			for(int j=1;j<head_B.size();j+=2) {
				for(int i=1;i<head_C.size();i+=2) {
					int exp = (int)head_B.get(j)+(int)head_C.get(i);
					int coff = (int)head_B.get(j-1)*(int)head_C.get(i-1);
					R.add(coff);
					R.add(exp);
				}
			}
			for(int j=1;j<R.size();j+=2) {
				for(int k =j+2;k<R.size();k+=2) {
					if(R.get(j) == R.get(k)) {
						int res = (int)R.get(j-1)+(int)R.get(k-1);
						R.set(j-1, res);
						R.remove(j);
						R.remove(k-1);
						R.remove(k-2);
						if(res == 0) {
							R.remove(j-1);
						}
						k=j;
					}
				}
			}
			return getArray(R);
		}
		return null;
	}
	@Override
	public void setCol(int val) {
		// TODO Auto-generated method stub
		colNum=val;
		return;
	}
	//get number of colums
	public int  bal(char poly) {
		if(poly == 'A') return head_A.size();
		if(poly == 'B') return head_B.size();
		if(poly == 'C') return head_C.size();
		if(poly == 'R') return R.size();
		return 0;
		
	}

}
