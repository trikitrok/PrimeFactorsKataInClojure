(ns prime-factors.core)

(defn- multiple? [number prime]
  (zero? (mod number prime)))

(defn factorize [number]
  (loop [number number prime 2 factors []]
    (cond 
      (= number 1) factors
      (multiple? number prime) (recur (/ number prime) prime (conj factors prime))
      :else (recur number (inc prime) factors))))


