# Отчёт о тестировании приложения "Precision"

## Краткое описание

Проводилось функциональное тестирование приложения "Precision". В ходе тестирования было выявлено, что функция расчета бонуса неверно рассчитывает итоговый бонус (при добавлении к regularBonus = 0,3 specialBonus = 0,6 результат сложения  = 0.8999999999999999). На данную ошибку заведен баг-репорт.

## Описание тестов

Проводилось позитивное функциональное тестирование функции расчета бонуса.

Тестовые данные:

* regularBonus = 0.3;
* specialBonus = 0.6;

## Результаты

1. 100 % не успешных тестов
2. [Ссылка на issue #1](https://github.com/Sviridova-Olga/JavaQA_Task_2.1_Precision/issues/1)

## Общие рекомендации

Для расчета бонуса рекомендую не использовать тип переменных double, например, вместо него можно использовать тип BigDecimal или же можно округлить итоговый результат до десятичных знаков.
