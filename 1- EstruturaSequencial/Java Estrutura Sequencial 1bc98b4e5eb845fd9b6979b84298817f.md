# Java Estrutura Sequencial

## 

Tipos primitivos em Java

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled.png)

# Saída de dados em Java

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%201.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%201.png)

**Para escrever dados da tela deveremos usar os seguintes comando:**

Sem quebra de linha:

```java
System.out.print("Bom dia!");
```

Com quebra de linha:

```java
System.out.println("Bom dia!");
```

**Trabalhando com casas decimais:**

```java
System.out.printf("%.2f%n", x);

```

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%202.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%202.png)

 **OBS:**

Nosso sistema por padrão vem com Windows em português, portando, os separadores dos números reais ao invés de **"."** será uma **","**

Portanto caso o desenvolvedor necessite trabalhar com o padrão americano será necessário usar o seguinte comando:

Será necessário importar essa classe:

```java
//"Caso o sistema não carregue de forma automática".
import java.util.Locale;
```

```java
/*use o seguinte comando:

O possívelmente o sistema carregue a biblioteca "import java.util.Locale;" 
automáticamente*/
 
Locale.setDefault(Locale.US);
```

**Comandos:**

```java
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		int y;
		double x;
		y = 32;
		x = 10.35784;
		
		System.out.println(y);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais por mês.%n", 
				nome, idade, renda);
		
		System.out.print("Bom dia!");

	}

	}
```

**Console**:

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%203.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%203.png)

# Exercício

Faça com que o console imprima o seguinte texto:

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%204.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%204.png)

**Resposta:**

```java
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.1f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println(" ");
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println(" ");
		System.out.println("Measue with eight decimal places:" + measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f", measure);
			
		
	}

}
```

**Console:**

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%205.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%205.png)

**Processamento de dados Java, Casting** 

```java
package processamentoDeDados;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		//casting conversão dos valores.
		resultado = (double) a / b;
		System.out.println(resultado);

	}

}
```

```java
package processamentoDeDados;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a;
		int b;
		a = 5.0;
		b = (int) a;
		System.out.println(b);

	}

}
```

# Entrada de Dados

Para ler uma String:

```java
package processamentoDeDados;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//para ler uma String
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		
		sc.close();
		

	}

}
```

Para inteiro:

```java
package processamentoDeDados;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//para ler uma String
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		
		
		sc.close();
		

	}

}
```

Para ponto flutuante

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%206.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%206.png)

```java
package processamentoDeDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//comando para trabalhar com marcação USA usando "." ao invés da ",".
		Locale.setDefault(Locale.US);
		
		//para ler uma entdrada do tipo double
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		//Imprimir o que foi armazenado na variável. 
		System.out.printf("Você digitou: %.2f%n ", x);
		
		
		//fechando o Scanner
		sc.close();
		

	}

}
```

Para ler um caractere

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%207.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%207.png)

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%208.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%208.png)

```java
package processamentoDeDados;
import java.util.Locale;
import java.util.Scanner;

public class uriOnlineJudge1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//padrão de USA
		Locale.setDefault(Locale.US);
			
			double area, n, raio;
			
			//a variável recebe o valor de pi.
			n = 3.14159;
			
			//O sistema irá escanear a entrada do teclado.
			Scanner sc = new Scanner(System.in);
			
		    //O valor digitado no teclado armazenará na variável raio.
			raio = sc.nextDouble();
			
	
			//area " = -> recebe " pi x (raio x raio)
			area = n * (raio * raio);
			
			//imprimindo o resultado na tela com "%.4f  -> Quatro casas decimais"
			System.out.printf("A=%.4f\n", area);
			
		//fechando o Scanner		
		sc.close();		

	}

}
```

Para ler uma Linha inteira:

```java
package processamentoDeDados;

import java.util.Scanner;

public class LerUmTextoAteQuebraDeLinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

			String s1, s2, s3;
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			s3 = sc.nextLine();
			System.out.println("DADOS DIGITADOS:");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
	
		sc.close();

	}

};
```

Para armazenar uma linha.

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%209.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%209.png)

## Funções Matemáticas

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2010.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2010.png)

```java
package processamentoDeDados;

public class funcoesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarando variáveis:
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//A recebe Raiz quadrada de x que é = a 3.0
		A = Math.sqrt(x);
		
		//B recebe Raiz quadrada de y que é = a 3.0
		B = Math.sqrt(y);
		
		//C recebe Raiz quadrada de 25.0 que é = 5
		C = Math.sqrt(25.0);
		
		/*Sistema imprimirá o valor armazenado variáel declarada que 
		é x = 3.0 e o resultado de A*/	
		System.out.println("Raiz quadrada de " + x + " = " + A);

		/*Sistema imprimirá o valor armazenado variáel declarada que 
		é Y = 4.0 e o resultado de B*/		
		System.out.println("Raiz quadrada de " + y + " = " + B);
		
		/*Sistema imprimirá o valor armazenado variáel declarada que 
		é Y = 25.0 e o resultado de C*/	
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//O resuldado de A será x elevado a y
		A = Math.pow(x, y);
		//O resulado de B será de x elevado a 2.0
		B = Math.pow(x, 2.0);
		//O resutado de C será de 5.0 elevado a 2.0
		C = Math.pow(5.0, 2.0);
		
		//O sistema imprimirá o resuldado A concatenado com x e y
		System.out.println(x + " elevado a " + y + " = " + A);
		//O sistema imprimirá o resuldado B concatenado com x
		System.out.println(x + " elevado ao quadrado = " + B);
		//O sistema imprimirá o resuldado C concatenado com a String concatenado com x e y
		System.out.println("5 elevado ao quadrado = " + C);
		//A receberá o valor absoluto de y 
		A = Math.abs(y);
		//B receberá o valor absoluto z
		B = Math.abs(z);
		//Sistema imprimirá o valor da variável de y concatenada com o valor de A
		System.out.println("Valor absoluto de " + y + " = " + A);
		//Sistema imprimirá o valor d variável de z concatenada com o valor de B
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}
```

Console:

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2011.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2011.png)

# Exercício Estrutura Sequencial:

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2012.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2012.png)

Resposta:

```java
package processamentoDeDados;
import java.util.Scanner;

public class uriOnlineJudge1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		int A, B, SOMA;
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
		
		
		teclado.close();
		
		
	}

}
```

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2013.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2013.png)

Resposta:

```java
package processamentoDeDados;
import java.util.Locale;
import java.util.Scanner;

public class uriOnlineJudge1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double area, pi, raio;
			
			
			pi= 3.14159;
			raio = sc.nextDouble();
			area = pi * Math.pow(raio , 2);
			System.out.printf("A=%.4f%n", area);
				
		sc.close();		

	}

}
```

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2014.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2014.png)

```jsx
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		
		int diferenca = (a * b) - (c *d);
		
		System.out.printf("DIFERECA = %d", diferenca);
		
		teclado.close();
		
		
		
	}

}
```

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2015.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2015.png)

```jsx
import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		String numeroPeca1 = teclado.next();
		int quantiPecas1 = teclado.nextInt();
		double valorPeca1 = teclado.nextDouble();
		
		String numeroPeca2 = teclado.next();
		int quantiPecas2 = teclado.nextInt();
		double valorPeca2 = teclado.nextDouble();
		
		double total = (double) (quantiPecas1 * valorPeca1) + (quantiPecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		
		teclado.close();
		

	}

}
		
		
```

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2016.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2016.png)

```jsx
import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		String numeroPeca1 = teclado.next();
		int quantiPecas1 = teclado.nextInt();
		double valorPeca1 = teclado.nextDouble();
		
		String numeroPeca2 = teclado.next();
		int quantiPecas2 = teclado.nextInt();
		double valorPeca2 = teclado.nextDouble();
		
		double total = (double) (quantiPecas1 * valorPeca1) + (quantiPecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		
		teclado.close();
		

	}

}
		
		
```

![Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2017.png](Java%20Estrutura%20Sequencial%201bc98b4e5eb845fd9b6979b84298817f/Untitled%2017.png)

Resposta

```jsx
import java.util.Locale;
import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		
		double a, b, c;
		double pi = 3.14159;
		
		
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		
		
		double triangulo = (a * c) / 2;
		double circulo = pi * Math.pow(c, 2);
		double trapezio = ((a + b) * c) / 2;
		double quadrado = Math.pow(b, 2);
		double retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("Retangulo: %.3f\n", retangulo);
	
		teclado.close();
	}
}
```