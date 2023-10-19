import pygame as pg
from random import randrange
window = 600
title_size = 50
range_ = (title_size // 2, window - title_size // 2, title_size)
get_random_position = lambda: [randrange(*range_), randrange(*range_)]
snake = pg.rect.Rect([0, 0, title_size - 2, title_size - 2])
snake.center = get_random_position()
length = 1
segments = [snake.copy()]
snake_dir = (0, 0)
time, time_step = 0, 110
food = snake.copy()
food.center = get_random_position()
screen = pg.display.set_mode([window] * 2)
clock = pg.time.Clock()
dirs={pg.K_UP: 1, pg.K_DOWN: 1, pg.K_LEFT: 1, pg.K_RIGHT: 1, }
while True:
    for event in pg.event.get():
        if event.type == pg.QUIT:
            exit()
        if event.type == pg.KEYDOWN:
            if event.key == pg.K_UP and dirs[pg.K_UP]:
                snake_dir = (0, -title_size)
                dirs={pg.K_UP: 1, pg.K_DOWN: 0, pg.K_LEFT: 1, pg.K_RIGHT: 1, }
            if event.key == pg.K_DOWN and dirs[pg.K_DOWN]:
                snake_dir = (0, title_size)
                dirs={pg.K_UP: 0, pg.K_DOWN: 1, pg.K_LEFT: 1, pg.K_RIGHT: 1, }
            if event.key == pg.K_LEFT and dirs[pg.K_LEFT]:
                snake_dir = (-title_size, 0)
                dirs={pg.K_UP: 1, pg.K_DOWN: 1, pg.K_LEFT: 1, pg.K_RIGHT: 0, }
            if event.key == pg.K_RIGHT and dirs[pg.K_RIGHT]:
                snake_dir = (title_size, 0)
                dirs={pg.K_UP: 1, pg.K_DOWN: 1, pg.K_LEFT: 0, pg.K_RIGHT: 1, }
    screen.fill('black')
    self_eating = pg.Rect.collidelist(snake, segments[:-1]) != -1
    if snake.left <0 or snake.right > window or snake.top < 0 or snake.bottom>window or self_eating:
        snake.center, food.center = get_random_position(), get_random_position()
        length, snake_dir = 1, (0, 0)
        segments = [snake.copy()]
    if snake.center == food.center:
        food.center = get_random_position()
        length += 1
    pg.draw.rect(screen, 'red', food)
    [pg.draw.rect(screen, 'green', segment) for segment in segments]
    time_now = pg.time.get_ticks()
    if time_now - time > time_step:
        time = time_now
        snake.move_ip(snake_dir)
        segments.append(snake.copy())
        segments = segments[-length:]
        pg.display.flip()
    clock.tick(60)
