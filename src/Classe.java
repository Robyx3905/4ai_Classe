import java.util.Arrays;
//Versione 1
public class Classe {
private int nStud,piano;
private String sede, nomClasse;
private Alunno[]alunni;
public Classe(String sed,int p){
	sede=sed;
	piano=p;
	nStud=0;
	nomClasse="";
	
}
public int getNumStud() {
	return nStud;
}
public int getpiano() {
	return piano;
}
public Alunno getStud(int pos) {
	return alunni[pos];
	}
public void setClasse(String n) {
	nomClasse=n;
}
public void setAlunno(int i,Alunno alu){
	alunni[i]=alu;
}
public void setNumStud(int i) {
	nStud=i;
	alunni =new Alunno[nStud];
}
@Override
public String toString() {
	return "Classe [nStud=" + nStud + ", piano=" + piano + ", sede=" + sede + ", nomClasse=" + nomClasse + ", alunni="
			+ Arrays.toString(alunni) + "]";
}
public static void main(String[] args) {
	Classe c=new Classe("Centrale",1);
	Alunno a=new Alunno("Roberto","Gaetani","2005/06/21","Via delle Rose 48");
	
	a.setClasse("4AI");
	c.setClasse("4AI");
	c.setNumStud(26);
	c.setAlunno(0, a);
	
	System.out.println(c.toString());
	
}
}
