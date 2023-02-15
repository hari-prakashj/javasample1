package com.onesoft.exception;

public class Stack {
 public void findA() {
	 findB();
 }
 public void findB() {
	 findA();
 }
 public static void main(String[]args) {
	 Stack s1 = new Stack();
	 s1.findA();
	 s1.findB();
 }
}
