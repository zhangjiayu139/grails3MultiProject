package qms.controller

import grails.core.GrailsApplication
import grails.plugins.*
import middol.test.TestService

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager
    TestService testService
    def index() {
        render testService.test()
//        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }
}
