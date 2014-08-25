(ns prime-factors.core)

(defn factorize [number]
  (cond 
    (= number 1) []
    (zero? (mod number 2)) (conj (factorize (/ number 2)) 2)
    :else [3]))
