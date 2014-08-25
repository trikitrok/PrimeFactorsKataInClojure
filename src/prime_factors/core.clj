(ns prime-factors.core)

(defn factorize [number]
  (if (= number 1) 
    []
    [number]))
