# task87 bean_factory (internals)
- @SpringBootTest: ctx.getBean(X.class) дважды → тот же объект (singleton scope).
- @Lazy-бин: счётчик/флаг создания — не создан до первого getBean, создан после.
- Вывод: ApplicationContext = BeanFactory + eager + события/ресурсы; в проде — инъекция, не ручной getBean.
