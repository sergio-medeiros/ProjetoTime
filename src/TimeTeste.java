import java.util.Scanner;

public class TimeTeste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int h, m, s;
		h = teclado.nextInt();
		m = teclado.nextInt();
		s = teclado.nextInt();
		Time setTime = new Time(h,m,s);
		System.out.println(setTime.exibirHoraPadrao());
		System.out.println(setTime.exibiHoraUniversal());
		teclado.close();
	}

}
