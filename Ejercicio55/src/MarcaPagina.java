
public class MarcaPagina {

	/*
	 * Escribe la clase MarcaPagina, que ayuda a llevar
	 * el control de la lectura,de un libro.
	 * Deberá disponer de métodos para incrementar la página
	 * leída, para obtener información de la última página
	 * que se ha leído y para comenzar desde el principio una
	 * nueva lectura del mismo libro.
	 */
	
	private int numeroDePaginas;
	
	//constructor por defecto
	public MarcaPagina() {
		
		this.numeroDePaginas = 0;		
	}
	
	//constructor por parametros
	public MarcaPagina(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	//constructor por copia
	public MarcaPagina(MarcaPagina marcaPagina) {
		this.numeroDePaginas = marcaPagina.numeroDePaginas;
	}
	
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	
	public void setNumeroDePaginas(int paginas) {
		numeroDePaginas = paginas;
	}
	
	
}
