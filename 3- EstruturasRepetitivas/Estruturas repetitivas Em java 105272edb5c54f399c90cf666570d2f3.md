# Estruturas repetitivas Em java

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled.png)

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%201.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%201.png)

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%202.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%202.png)

# Teste While

### Teste de Mesa Manual:

**1º)**

```jsx
x = 0;
y = 4;
while(x < 3){
y = y + 2;
x = x + 1;
System.out.println(x + "-" + y);
}
```

**Variáveis:**

x = **~~0~~ - ~~1~~ - ~~2~~ - 3**

y = **~~4~~ - ~~6~~ - ~~8~~ - 10** 

**Tela**

1 - 6
2 - 8

3 - 10

**2º)**

```jsx
x =5;
y = 0;
while(x > 2){
	System.out.println(x);
	y = y + x;
	x = x - 1;
}
```

**Variáveis** 

x = **~~5 - 4 - 3~~ - 2**

y = **~~0 - 5 - 9~~ - 12**

**Tela**

**5  4  3**

**3º)**

```jsx
x = 2;
y = 0;
while(x < 60){
	System.out.println(x);
	x = x * 2;
	y = y + 10;
}
```

**Variáveis** 

x = ~~**2 - 4 - 8 - 16 - 32~~ - 64**

y = **~~0 - 10 - 20 - 30 - 40~~ - 50**

**Tela**

**2 4 8 16 32**

**4°)**

```jsx
x = 100;
y = 100;
while(x != y){
	System.out.println("olha");
	x = Math.sqrt(y);
}
```

**Variáveis**

x = **100**

y = **100**

**Tela**

**5°)**

```jsx
x = 0;
while(x < 5){
	y = x * 3;
	System.out.println(y);
  x = x + 1; 
}
System.out.println("fim");
```

**Variáveis**

x = **~~0** **- 1 - 2 - 3 - 4~~ - 5**

y = **~~0 - 3 - 6 - 9~~ - 12**

**Tela**

**0 3 6 9 12
fim**

**6°)**

```jsx
x = 2;
y = 10;
System.out.println("Olá");
while(x < y){
	System.out.println(x + "-" + y );
	x = x * 2;
	y = y + 1;
}
```

**Variáveis**

x = **~~2 - 4 - 8~~ - 16** 

y = **~~10 - 11 - 12~~ - 13** 

**Tela**

**Olá**

**2 - 10
4 - 11
8 - 12**

**7º)**

```jsx
x = 4;
y = 0;
i = 0;
while(i < x){
	i = i + 1;
	y = y + i;
	System.out.print(i);
	System.out.println(y);
	
}
```

**Variáveis**

x = **4** 

y = **0 - 1 - 3 - 6 - 10**

i =  **0 - 1 - 2 - 3 - 4**

**Tela**

**1 1
2 3
3 6
4 10**

### Exercício:

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%203.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%203.png)

**Resposta:**

```java
import java.util.Scanner;

public class Ex001while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        while (entrada != 2002){
           
            System.out.println("Senha Inválida");
            entrada = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
```

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%204.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%204.png)

**Resposta:**

```java
import java.util.Scanner;

public class Ex002While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro");
                x = sc.nextInt();
                y = sc.nextInt();

            }else if (x > 0 && y < 0){
                System.out.println("Quarto");
                x = sc.nextInt();
                y = sc.nextInt();
            }else if (x < 0 && y < 0){
                System.out.println("Terceiro");
                x = sc.nextInt();
                y = sc.nextInt();
            }else{
                System.out.println("Segundo");
                x = sc.nextInt();
                y = sc.nextInt();
            }

        }
        System.out.println("");

        sc.close();

    }
}

```

# Estrutura repetitiva "para" (for)

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%205.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%205.png)

**Exemplo 1:**

```java
import java.util.Scanner;

public class TipoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int soma = 0;
            for (int i = 0; i < n; i++ ){
                int x = sc.nextInt();
                soma = soma + x;
            }
        System.out.println(soma);

        sc.close();
    }
}
```

**Exemplo 2:**

```java
public class TipoFor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("Valor de i: " + i);
        }
    }
}
```

**Exemplo 3:**

```java
public class tipoFor3 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--){
            System.out.println("Valor de i: " + i);
        }
    }
}
```

# Teste For

### Teste de Mesa Manual:

**1º)**

```java
x = 3;
y = 0;

for(i = 0; i < x; i++){
	System.out.print(i + ",");
	y = y + 5;
  System.out.println(y);
}
```

**Variáveis**

x = **3**

y = **~~0 → 5 → 10~~ → 15**

i = ~~**0  → 1 → 2~~ → 3**

**Tela:**

**0, 5
1, 10
2 , 15**

**2º)**

```java
x = 4;
y = x + 2;
for (i = 0; i < x; i++){
	System.out.print(x + " " + y);
	y = y + i;
}
```

**Variáveis**

x = **4** 

y = **6 →6 → 7 → 9 → 12**

i =**0 → 1 → 2 → 3 → 4**

**Tela:**

**4 6 4 6  4 7 4 9**

**3°)**

```java
for (i = 1; i < 5; i++){
	y = i - 1;
	x = i * 10;
	System.out.print(i);
}
```

**Variáveis**

x = **~~10 → 20 → 30~~ → 40**

y = **~~0 → 1 → 2~~ → 3**

i = **~~1 → 2 → 3 → 4~~ → 5**

**Tela:**

**1 2 3 4** 

**4º)**

```java
y = 10;
for (i = 0; i < 4; i++){
	System.out.print(i);
	y = y + i;
	System.out.print(y);
}
```

**Variáveis**

x = 

y = **~~10 → 10 → 11→ 13~~ → 16**

i = **~~0 → 1 → 2 → 3~~ → 4**

**Tela:**

**0 10 
1 11
2 13
3 16**

**5°)**

```java
x = 4;
y = 0;
for (i = 0; i < x; i++){
	System.out.print(i);
	System.out.print(x);
	y = y + 10;
}
```

**Variáveis**

x = **4**

y = **~~0 → 10 → 20 → 30~~ → 40**

i =  **~~0 → 1 → 2 → 3~~ → 4**

**Tela:**

**0 4
1 4
2 4
3 4**

**6°)**

```java
x = 4;
y = 0;
for (i=0; i<x; i++) {
	y = y + i;
}
System.out.println(y);
```

**Variáveis**

x = **4**

y = **~~0 → 0 → 1 → 3~~ → 6**

i =  **~~0 → 1 → 2→ 3~~ → 4**

**Tela:**

**6**

**7°)**

```java
x = 8;
y = 3;
for (i=0; y<x; i++){
	x = x – 2;
	y = y + 1;
	System.out.println(i);
}
```

**Variáveis**

x = **8 → 6 → 4**

y = **3 → 4 → 5**

i =  **0 → 1 → 2**

**Tela:**

**0
1**

### Exercício:

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%206.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%206.png)

**Resposta:**

```java
import java.util.Scanner;

public class Ex001For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++ ){

            if (i % 2 != 0){
                System.out.println(i);

            }

        }

        sc.close();
    }
}
```

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%207.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%207.png)

**Resposta**

```java
import java.util.Scanner;

public class Ex002For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++ ){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){

                in = in + 1;

            }else{
                out = out + 1;
            }

        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
```

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%208.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%208.png)

**Resposta:**

```java
import java.util.Locale;
import java.util.Scanner;

public class Ex003For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n;i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);

        }

        sc.close();
    }
}
```

**Teste**

```java
        int n = sc.nextInt();
        for (int i = 0; i < n;i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);

        }
```

**Variáveis**

n= **3**

media = **5.7 → 6.3 → 9.3**

i = **0**

a = **6.5 → 4.3 → 6.2**

b = **5.1 → 4.2 → 8.1**

c = **8.0 → 9.0 → 10.0**

**Tela:**

**5.7
6.3
9.3**

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%209.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%209.png)

**Resposta:**

```jsx
import java.util.Scanner;
public class Ex004For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++ ){
            double p1 = sc.nextInt();
            double p2 = sc.nextInt();

            if (p1 <= 0 && p2 <= 0){
                System.out.println("Divisão Impossível");
            }else{
                double divisão = p1 / p2;
                System.out.println(divisão);
            }
        }

        sc.close();

    }
}
```

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2010.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2010.png)

**Resposta:** 

```jsx
import java.util.Scanner;

public class Ex005For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= n; i++){
            fat = fat * i;

        }
        System.out.print(fat);

        sc.close();

    }
}
```

**Teste**

```java
        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= n; i++){
            
						fat = fat * i;

        }
        System.out.print(fat);

```

**Variáveis**

n = **4**

fat = **~~1 → 1 → 2 → 6~~ → 24**

i = **~~1 → 2 → 3~~ → 4**

**Tela:**

**24**

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2011.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2011.png)

**Resposta:**

```jsx
import java.util.Scanner;

public class Ex006for {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

    for (int i = 1; i <= n; i++){

        if (n % i == 0){
            System.out.println(i);
        }

    }

        sc.close();
    }
}
```

**Teste**

```java
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++){

        if (n % i == 0){
            System.out.println(i);
        }
```

**Variáveis**

n = **6**

i = **1 → 2 → 3 → 4 → 5 → 6**

**Tela:**

**6**

**1**
**2**
**3**
**6**

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2012.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2012.png)

**Resposta**

```jsx
import java.util.Scanner;

public class Ex007For {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 5; i++){

            System.out.println(i + " " +(int)Math.pow(i, 2) + " " + (int)Math.pow(i,3));

        }

        sc.close();
    }
}
```

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2013.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2013.png)

![Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2014.png](Estruturas%20repetitivas%20Em%20java%20105272edb5c54f399c90cf666570d2f3/Untitled%2014.png)

**Problema exemplo:**

Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
programa.
Fórmula:  

**F  = 9C / 5 + 32**

**Digite a temperatura em Celsius: 30.0
Equivalente em Fahrenheit: 86.0
Deseja repetir (s/n)? s
Digite a temperatura em Celsius: 21.0
Equivalente em Fahrenheit: 69.8
Deseja repetir (s/n)? s
Digite a temperatura em Celsius: -10.5
Equivalente em Fahrenheit: 13.1
Deseja repetir (s/n)? n**

**Exemplo:** 

```jsx
import java.util.Locale;
import java.util.Scanner;

public class Ex001DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
            System.out.println("Deseja Repetir (s/n)?: ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');

        sc.close();
    }
}
```