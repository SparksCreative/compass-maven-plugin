/*
 * Copyright 2012 Sparks Creative Limited
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package net.uk.sparks.webstack.compass.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;


/**
 * Compiles .sass and .scss files into .css
 *
 * @goal compile
 * @phase generate-sources
 */
public class CompileMojo extends AbstractMojo {

    /**
     * Source directory for .sass and .scss files. Expressed relative to the project base directory.
     * @parameter expression="${compass.source}" default-value="${project.basedir}/src/main/resources/scss"
     */
    private File source;

    /**
     * Target directory for .css resources. Expressed relative to the base url of the intended service.
     * @parameter expression="${compass.target}" default-value="css"
     */
    private String target;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Compiling css resources");
    }
}
