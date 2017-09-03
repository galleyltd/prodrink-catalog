INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (1, 'Beer', null, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (2, 'Light Beer', 1, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (3, 'Sub light beer', 2, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (4, 'Sub sub light beer', 3, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (5, 'Sub sub light beer 2', 3, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (6, 'Sub light beer 2', 2, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (7, 'Dark beer', 1, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (8, 'Another top level category', null, null);