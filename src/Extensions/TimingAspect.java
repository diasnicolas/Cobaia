 package Extensions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import Sistema.Timing;

import framework.aop.annotations.*;

@Target(ElementType.METHOD)
@Extension(aspect=Timing.class, adviceType=AdviceType.Around)
public @interface TimingAspect {

}
