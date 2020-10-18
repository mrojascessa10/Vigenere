run:Main.class
	java Vigenere $(ARGS)

Main.class: Vigenere.java
	javac Vigenere.java

clean:
	rm Vigenere.class
