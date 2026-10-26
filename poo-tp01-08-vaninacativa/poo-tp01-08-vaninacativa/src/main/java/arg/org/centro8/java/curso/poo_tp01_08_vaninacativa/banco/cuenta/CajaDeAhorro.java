package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta;

import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {

    private float tasaDeInteres;

    // Devolucion: si se quierer que el saldo de una cuenta inicie siempre en
    // cero,no se deberia pedir en el constructor.

    //CajaDeAhorro modificacion no se pide el saldo en el constructor

    // Devolucion: en la clase CajaDeAhorro agregar el atributo de tasaDeInteres
    // dentro del constructor para darle un valor inicial.

    // Modificacion se agrego el atributo
    // dentro del constructor pra darle un valor inicial

    public CajaDeAhorro(int numeroCuenta, Cliente clienteAsociado, float tasaDeInteres) {
        super(numeroCuenta, clienteAsociado);
        this.tasaDeInteres=tasaDeInteres;
    }

    public void cobrarInteres() {
        final double interesGanado = (getSaldo() / 100 * getTasaDeInteres());
        this.setSaldo(this.getSaldo() + interesGanado);
        System.out.println("su saldo con el interes cobrado es " + getSaldo());
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto > 0 && monto <= getSaldo())
            this.setSaldo(getSaldo() - monto);
       else System.out.println("No dispone de saldo para realizar la extraccion");

    }

}
