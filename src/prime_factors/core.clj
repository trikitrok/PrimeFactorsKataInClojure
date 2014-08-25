(ns prime-factors.core)

(defn factorize [number]
  (loop [number number prime 2 factors []]
    (cond 
      (= number 1) factors
      (zero? (mod number prime)) (recur (/ number prime) prime (conj factors prime))
      :else (recur number (+ prime 1) factors))))
