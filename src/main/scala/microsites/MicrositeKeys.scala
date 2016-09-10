/*
 * Copyright 2016 47 Degrees, LLC. <http://www.47deg.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package microsites

import sbt._

trait MicrositeKeys {
  val makeMicrosite             = taskKey[Unit]("Main Task to build a Microsite")
  val microsite                 = taskKey[Seq[File]]("Create microsite files")
  val micrositeConfig           = taskKey[Unit]("Copy microsite config to the site folder")
  val micrositeName             = settingKey[String]("Microsite name")
  val micrositeDescription      = settingKey[String]("Microsite description")
  val micrositeAuthor           = settingKey[String]("Microsite author")
  val micrositeHomepage         = settingKey[String]("Microsite homepage")
  val micrositeTwitter          = settingKey[String]("Microsite twitter")
  val micrositeBaseUrl          = settingKey[String]("Microsite site base url")
  val micrositeDocumentationUrl = settingKey[String]("Microsite site documentation url")
  val micrositeHighlightTheme   = settingKey[String]("Microsite Highlight Theme")
  val micrositeImgDirectory = settingKey[File](
    "Optional. Microsite images directory. By default, it'll be the resourcesDirectory + '/microsite/img'")
  val micrositeCssDirectory = settingKey[File](
    "Optional. Microsite CSS directory. By default, it'll be the resourcesDirectory + '/microsite/css'")
  val micrositeExtratMdFiles = settingKey[Seq[File]](
    "Optional. Additional document files located in a different place from the tutSourceDirectory. By default, it's empty")
  val micrositePalette     = settingKey[Map[String, String]]("Microsite palette")
  val micrositeGithubOwner = settingKey[String]("Microsite Github owner")
  val micrositeGithubRepo  = settingKey[String]("Microsite Github repo")
}
object MicrositeKeys extends MicrositeKeys
