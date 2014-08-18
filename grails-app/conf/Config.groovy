// configuration for plugin testing - will not be included in the plugin zip

def dataSourceConfig = new File("${userHome}/" +
        ".grails/transmartConfig/DataSource-coredb.groovy")

if (!dataSourceConfig.exists())
    throw new RuntimeException("Coult not find ${dataSourceConfig}")

grails.config.locations = ["file:${dataSourceConfig.getAbsolutePath()}"]

org.transmartproject.i2b2.user_id = 'i2b2'
org.transmartproject.i2b2.group_id = 'Demo'

/*
Example configuration for using the reveng plugin
grails.plugin.reveng.defaultSchema = 'i2b2demodata'
grails.plugin.reveng.includeTables = ['qt_query_master', 'qt_query_instance',
        'qt_query_result_instance']
grails.plugin.reveng.packageName = 'org.transmartproject.db.querytool'
*/

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    info  'org.codehaus.groovy.grails.web.servlet',  //  controllers
           'org.codehaus.groovy.grails.web.pages', //  GSP
           'org.codehaus.groovy.grails.web.sitemesh', //  layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping', // URL mapping
           'org.codehaus.groovy.grails.commons', // core / classloading
           'org.codehaus.groovy.grails.plugins', // plugins
           'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'

    info   'org.mortbay.log'

    root {
        info('stdout')
    }
}

grails.converters.default.pretty.print=true

grails.views.default.codec="none" // none, html, base64
grails.views.gsp.encoding="UTF-8"

// Uncomment and edit the following lines to start using Grails encoding & escaping improvements

/* remove this line 
// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside null
                scriptlet = 'none' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        filteringCodecForContentType {
            //'text/html' = 'html'
        }
    }
}
remove this line */
