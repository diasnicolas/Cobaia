package Extensions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import Sistema.Timing;

import framework.aop.annotations.Extension;
import framework.aop.tools.AdviceType;

@Target(ElementType.METHOD)
@Extension(aspect=Timing.class, adviceType=AdviceType.Around)
public @interface TimingAspect {

}
