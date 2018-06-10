from src.sort_the_odd import sort_array
import unittest


class CodewarsTest(unittest.TestCase):
    def test_sort_the_odd(self):
        self.assertEqual(sort_array([5, 3, 2, 8, 1, 4]), [1, 3, 2, 8, 5, 4])
        self.assertEqual(sort_array([5, 3, 1, 8, 0]), [1, 3, 5, 8, 0])
        self.assertEqual(sort_array([]), [])


if __name__ == '__main__':
    unittest.main(verbosity=2)
