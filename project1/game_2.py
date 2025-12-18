
import pygame
import sys

# Define constants
WINDOW_SIZE = (800, 600)
BACKGROUND_COLOR = (0, 0, 255)
WINDOW_TITLE = "Flying Bird Game"

# Initialize Pygame
pygame.init()

# Set up the display
screen = pygame.display.set_mode(WINDOW_SIZE)
pygame.display.set_caption(WINDOW_TITLE)

# Load the bird image
bird_image = pygame.image.load('/project1/bird.png')
bird_rect = bird_image.get_rect()
bird_rect.y = 250  # Set the vertical position of the bird
bird_speed = 5  # Speed of the bird

# Main game loop
while True:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

    # Move the bird
    bird_rect.x += bird_speed

    # Reset the bird's position if it goes off-screen
    if bird_rect.x > WINDOW_SIZE[0]:
        bird_rect.x = -bird_rect.width

    # Fill the screen with the background color
    screen.fill(BACKGROUND_COLOR)

    # Draw the bird on the screen
    screen.blit(bird_image, bird_rect)

    # Update the display
    pygame.display.update()