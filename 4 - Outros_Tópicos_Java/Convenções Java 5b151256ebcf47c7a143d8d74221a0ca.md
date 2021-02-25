# Convenções Java

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%201.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%201.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%202.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%202.png)

Exemplo: 

```jsx
package entities;
public class Account {
private String holder;
private Double balance;
public Account(String holder, Double balance) {
this.holder = holder;
this.balance = balance;
}
public String getHolder() {
return holder;
}
public void deposit(double amount) {
balance += amount;
}
public void withdraw(double amount) {
balance -= amount;
}
}
```

## Operadores bitwise

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%203.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%203.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%204.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%204.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%205.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%205.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%206.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%206.png)

```jsx
import java.util.Scanner;

public class OperadoresBitwise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0 ){
            System.out.println("6th mit is true!");
        } else {
            System.out.println("6th bit is false");
        }

        sc.close();

    }
}
```

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%207.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%207.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%208.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%208.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%209.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%209.png)

# Comentários em Java.

```jsx
package course;
import java.util.Locale;
import java.util.Scanner;
/*
Este programa calcula as raízes de uma equação do segundo grau
Os valores dos coeficientes devem ser digitados um por linha
*/
public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
double a, b, c, delta;
System.out.println("Digite os valores dos coeficientes:");
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
delta = b * b - 4 * a * c; // cálculo do valor de delta
```

# Funções (sintaxe)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%2010.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%2010.png)

![Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%2011.png](Convenc%CC%A7o%CC%83es%20Java%205b151256ebcf47c7a143d8d74221a0ca/Untitled%2011.png)

**Resposta:** 

```jsx
import java.util.Scanner;

public class ProblemaExemplo_Sintaxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a,b,c);
		
		
		showResult(higher);
		
		sc.close();
	}
	
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if (y > x && y > z) {
			aux = y; 
		}else {
			aux = z;
		}
		return aux;
		
	}
	
	public static void showResult(int value) {
		System.out.println("Higher :" + value);
	}

}
```