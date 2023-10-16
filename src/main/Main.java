package main;

import java.util.Scanner;
import java.util.UUID;

import entities.Cliente;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n CADASTRO DE CLIENTE \n");

		Cliente cliente = new Cliente();

		Scanner scanner = new Scanner(System.in);

		cliente.setId(UUID.randomUUID());
		System.out.println("\nINFORME O NOME DO CLIENTE:");
		cliente.setNome(scanner.nextLine());
		System.out.println("\nINFORME O CPF DO CLIENTE:");
		cliente.setCpf(scanner.nextLine());
		System.out.println("\nINFORME O EMAIL DO CLIENTE:");
		cliente.setEmail(scanner.nextLine());

		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("ID.....: " + cliente.getId());
		System.out.println("NOME...: " + cliente.getNome());
		System.out.println("CPF....: " + cliente.getCpf());
		System.out.println("EMAIL..: " + cliente.getEmail());

		scanner.close();
	}
}
