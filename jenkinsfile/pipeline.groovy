@Library('Jenkinsfiles@master')
import com.sample.pipeline.ComponentPipeline
new ComponentPipeline(this).invoke()
