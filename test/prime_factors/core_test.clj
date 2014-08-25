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
        (factorize 3) => [3]))


