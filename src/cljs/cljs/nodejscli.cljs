;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

; Projects compiled with :target :nodejs have this file appended.  Its
; job is to make sure cljs.nodejs is loaded and that the *main-cli-fn*
; is called with the script's command-line arguments.
(ns cljs.nodejscli
  (:require [cljs.nodejs :as nodejs]))

; Call the user's main function
(apply cljs.core/*main-cli-fn* (drop 2 (.-argv nodejs/process)))

