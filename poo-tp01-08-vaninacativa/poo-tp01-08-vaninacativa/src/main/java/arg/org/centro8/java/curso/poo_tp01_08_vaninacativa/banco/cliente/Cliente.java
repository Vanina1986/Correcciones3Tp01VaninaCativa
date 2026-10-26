package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/*
 * Correccion dada en clase:
 * faltaria el getter y el ToString si 
 * se quiere utilizar
  Correccion hecha
 *  Getter se agrego el getter para ser utilizado; getter es metodo
 *  que permite acceder a los atributos.
 * ToString   se agregro el ToString;ToString metodo heredado de Clase
 *  Objet es la clase padre de todas la clase.Su funcion es
 *  representar al objeto en forma de cadena de caracteres.
 */
@Getter
@ToString
@RequiredArgsConstructor // crea el constructor con atributos finales

// devolucion. eliminar los setters para los atributos o marcarlos como
// final.
// no se agrego Setter, no se necesitaria modificar el numero de cuenta

/*
 * devolucion :
 * poder explicar lo que es una clase abstracta
 */

/*
 * class:es una plantilla o molde que define los atributos
 * y metodos que tendran los objetos.
 * abstract cuando una clase es abstracta no se pueden crear un objeto
 * se utiliza abstract pra favorecer la herencia.
 */

/*
 * Devolucion:
 * Poder explicar los modificadores de visibilidad:
 * private nivel acceso restringido.Accesible solo para la
 * clase que lo esta definiendo.Utilizado para declarar
 * miembros solo deben ser utilizadospor la clase.
 */
public abstract class Cliente {
  // declaracion de atributo(variable que indican caracteristica)
  private final int numeroCliente;
  // final queda constante.No se va poder modificar su valor.
}
