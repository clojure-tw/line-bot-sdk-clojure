(defproject line-bot-sdk-clojure "0.1.0-SNAPSHOT"
  :description "SDK of the LINE Messaging API for Clojure"
  :url "https://github.com/clojure-tw/line-bot-sdk-clojure"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler webapp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
