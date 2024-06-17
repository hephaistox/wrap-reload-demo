(ns ring-app.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [ring-app.ext :as ext]
            [ring.util.response :as response]))

(defn handler [request-map]
  (response/response
   (str "<html><body> your IP is:  "
        (:remote-addr request-map)
        (pr-str (ext/I-dont-do-too-much 12))
        (pr-str (ext/I-dont-do-too-much-but-I-doitwell 12))
        "</body></html>")))

(defn -main []
  (-> #'handler
      wrap-reload
      (jetty/run-jetty
       {:port 3000
        :join? false})))
