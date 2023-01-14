
public class Alunno {
	private String classe, nome, cognome, indirizzo,dataN;
	
	public Alunno(String n,String c,String d,String i){
		nome=n;
		cognome=c;
		dataN=d;
		indirizzo=i;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getDataN() {
		return dataN;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public String getClasse() {
		return classe;
	}
	public void setNome(String n) {
		nome=n;
	}
	public void setCognome(String c) {
		cognome=c;
	}
	public void setDataN(String d) {
		dataN=d;
	}
	public void setIndirizzo(String i) {
		indirizzo=i;
	}
	public void setClasse(String c) {
		classe=c;
	}
	

	@Override
	public String toString() {
		return "Alunno [classe=" + classe + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo
				+ ", data di Nascita=" + dataN + "]";
	}
	public static void main(String[] args) {
		Alunno a=new Alunno("Roberto","Gaetani","2005/06/21","Via delle Rose 48");
		System.out.println(a.toString());
		Alunno a1=new Alunno("Alessio","Gaetano","aaaa","Via d");
		System.out.println(a1.toString());
		a.setClasse("4AI");
		System.out.println(a.toString());
	}

}
