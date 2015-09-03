import java.util.Iterator;
import java.util.*;


public class Organizadora{
	
	private Factory<String> factory;
	private Set<String> pila;
	private Set<String> pJava;
	private Set<String> pCelular;
	private Set<String> pWeb;
	private Iterator<String> vals;
	
	public Organizadora(int i){
		factory = new Factory<String>();
		pJava = factory.getSet(i);
		pWeb = factory.getSet(i);
		pCelular= factory.getSet(i);
}
	/**
	 * Método: dordenSet
	 * Funcionalidad:
	 * Mediante los parámetros recibidos agregará en el conjunto
	 * correspondiente al desarrollador,según sus aptitudes.
	 * @param int pJ,pW,pC
	 * @return void
	 */
	public void ordenSet(int pJ, int pW, int pC, String name){
		if (pJ == 1){
			pJava.add(name);
		}
		if (pC == 1){
			pCelular.add(name);
		}
		if (pW == 1){
			pWeb.add(name);
		}	
	}
	/**
	 * Método: desJWC
	 * Funcionalidad:
	 * Determina quienes son los desarrolladores con habilidades
	 * en Java, Web y celular. Y los muestra.
	 * @return void 
	 */
	public void desJWC(){
		vals= pJava.iterator();
		String valor;
		System.out.println("Estos son los desarrolladores que tiene experiencia en los 3 campos");
		while(vals.hasNext()){
		valor= vals.next();
		if (pWeb.contains(valor)== true && pCelular.contains(valor) == true){
		    System.out.println(valor);
		}
		}
	}
	/**
	 * Método: desJava
	 * Funcionalidad:
	 * Determina quienes tienen habilidades en Java pero no en Web.
	 * @return void
	 */
	public void desJava(){
		vals= pJava.iterator();
		String valor;
		System.out.println("Estos son los desarrolladores que tiene experiencia en Java y no en Web");
		while(vals.hasNext()){
		valor= vals.next();
		if (pWeb.contains(valor)== false ){
		    System.out.println(valor);
		}
		}
	}
	/**
	 * Método: desWc
	 * Funcionalidad:
	 * Determina quienes tienen habilidades en desarrollo Web y Celulares 
	 * @return void
	 */
	public void desWC(){
		vals= pWeb.iterator();
		String valor;
		System.out.println("Estos son los desarrolladores que tiene experiencia en Web y Celulares");
		while(vals.hasNext()){
		valor= vals.next();
		if (pJava.contains(valor)== false && pCelular.contains(valor) == true){
		    System.out.println(valor);
		}
		}
	}
	/**
	 * Método: desWc
	 * Funcionalidad:
	 * Determina quienes tienen habilidades en desarrollo Web o Celulares 
	 * @return void
	 */
	public void desWoC(){
		vals= pWeb.iterator();
		String valor;
		System.out.println("Estos son los desarrolladores que tiene experiencia en Web o Celulares");
		while(vals.hasNext()){
		valor= vals.next();
		if (pJava.contains(valor)== false && pCelular.contains(valor) == false){
		    System.out.println(valor);
		}
		}
		vals=pCelular.iterator();
		while(vals.hasNext()){
		valor=vals.next();
		if (pJava.contains(valor)== false && pWeb.contains(valor) == false){
		    System.out.println(valor);
		}
		}
		}
	/**
	 * Método: isSub
	 * Funcionalidad:
	 * Determina si un conjunto es subconjunto de otro
	 * @return void
	 */
	public void isSub(){
		if (pWeb.containsAll(pJava)== true){
		System.out.println("El conjunto de desarrolaldores Java es subconjunto de desarrolladores Web ");
		}
	}
/**
	 * Método maxDesAs
	 * Funcionalidad:
	 * Determina el conjunto con mayor tamaño e imprime
	 * a sus miembros.
	 * @return void
	 */
	public void maxDes(){
		pJava.size();
		pWeb.size ();
		pCelular.size();
		
		if (pJava.size() > pWeb.size() && pJava.size() > pCelular.size()){
			System.out.println("El conjunto de mayor tamño es: desarrolladores Java");
			System.out.println(pJava);
		}
		else if (pWeb.size() > pJava.size() && pWeb.size() > pCelular.size()){
			System.out.println("El conjunto de mayor tamño es: desarrolladores Web");
			System.out.println(pWeb);;
		}
		else if (pCelular.size() > pWeb.size() && pCelular.size() > pJava.size()){
			System.out.println("El conjunto de mayor tamño es: desarrolladores Celulares");
			System.out.println(pCelular);
		}
		else{
			System.out.println("Al parecer hay dos conjuntos iguales, no puede determinarse el mayor");
		}
	}
	/**
	 * Método maxDesAs
	 * Funcionalidad:
	 * Determina el conjunto con mayor tamaño e imprime de menor a mayor
	 * a sus miembros.
	 * @return void
	 */
	public void maxDesAs(){
		pJava.size();
		pWeb.size ();
		pCelular.size();
		
		if (pJava.size() > pWeb.size() && pJava.size() > pCelular.size()){
			System.out.println("El conjunto de mayor tamño es: desarrolladores Java");
			Set<String> tset=new TreeSet<String>(pJava);
			System.out.println(tset);
		}
		else if (pWeb.size() > pJava.size() && pWeb.size() > pCelular.size()){
			System.out.println("El conjunto de mayor tamño es: desarrolladores Web");
			Set<String> tset=new TreeSet<String>(pWeb);
			System.out.println(tset);
		}
		else if (pCelular.size() > pWeb.size() && pCelular.size() > pJava.size()){
			System.out.println("El conjunto de mayor tamño es: desarrolladores Celulares");
			Set<String> tset=new TreeSet<String>(pCelular);
			System.out.println(tset);
		}
		else{
			System.out.println("Al parecer hay dos conjuntos iguales, no puede determinarse el mayor");
		}
	}

}
