package com.example.demo.cmm.util;

import java.util.function.*;

import org.springframework.stereotype.Component;

import com.example.demo.bbs.domain.Board;
import com.example.demo.uss.domain.User;

@Component
public class Proxy {
	public Consumer<String> print = System.out::print;
	public Function<Object, String> string = String::valueOf;
	public Function<String, Integer> integer = Integer::parseInt;
	public Function<Double, Double> doubleAbs = Math::abs;
	public Function<Float, Float> floatAbs = Math::abs;
	public Function<Integer, Integer> intAbs = Math::abs;
	public Function<Double, Double> longAbs = Math::abs;
	public Function<Double, Double> ceil = Math::ceil;
	public Function<Double, Double> floor = Math::floor;
	public Supplier<Double> random = Math::random;
	public static BiFunction<Integer, Integer, Integer> rangeRandom = (t,u) -> ((int)(Math.random() * (u - t)) + t);
	public Function<Double, Double> rint = Math::rint;
	public Function<Double, Long> round = Math::round;
	public Supplier<User> newUser = User::new;
	public Supplier<Board> newBoard = Board::new;
}