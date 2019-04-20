package eg.edu.alexu.csd.datastructure.linkedList;

public interface IPolynomialSolver {
	public int colNum=0;
	void setPolynomial(char poly, int[][] terms);
	String print(char poly);
	void clearPolynomial(char poly);
	float evaluatePolynomial(char poly, float value);
	int[][] add(char poly1, char poly2);
	int[][] subtract(char poly1, char poly2);
	int[][] multiply(char poly1, char poly2);
	void setCol(int val);
	int  bal(char poly);
}
