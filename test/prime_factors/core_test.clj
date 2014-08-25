(ns prime-factors.core-test
  (:use midje.sweet)
  (:use [prime-factors.core]))

(println "You should expect to see three failures below.")

(facts 
  "about prime factors computation"
  (fact "1 has no factors"
        (factorize 1) => [])
  
  (fact "a prime has only one factor: itself"
        (factorize 2) => [2]
        (factorize 3) => [3])
  
  (fact "any power of primes has only one factor repeated as many times as the exponent"
        (factorize 8) => [2 2 2]
        (factorize 81) => [3 3 3 3])
  
  (fact "any other positive integer has more than one factor"
        (factorize 10) => [2 5]
        (factorize 60) => [2 2 3 5]))


